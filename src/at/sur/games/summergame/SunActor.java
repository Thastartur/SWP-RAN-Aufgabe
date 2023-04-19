package at.sur.games.summergame;

import at.sur.games.summergame.MoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class SunActor implements Actor{

    private MoveStrategy moveStrategy;
    private List<ColorObserver> colorobservers;
    private List<Observer> observers;

    private boolean activateSpace;

    public SunActor(MoveStrategy mr) {
        super();
        this.moveStrategy = mr;

        this.colorobservers = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addColorObserver(ColorObserver observer) {
        this.colorobservers.add(observer);
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);

        if (this.moveStrategy.getX() > 50 && this.moveStrategy.getX() < 700) {
            for (ColorObserver observer : colorobservers) {
                observer.informColor(Color.green);
            }
        }
        else {
            for (ColorObserver observer : colorobservers) {
                observer.informColor(Color.white);
            }
        }

        if (gc.getInput().isKeyDown(Input.KEY_SPACE)) {
            if (! activateSpace) {
                for (Observer observer : observers) {
                    observer.inform();
                }

                this.activateSpace = true;
            }
            else {
                this.activateSpace = false;
            }
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 100, 100);
        graphics.setColor(Color.white);
    }
}
