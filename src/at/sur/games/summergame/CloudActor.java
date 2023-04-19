package at.sur.games.summergame;

import at.sur.games.summergame.MoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class CloudActor implements Actor{

    private MoveStrategy moveStrategy;

    public CloudActor(MoveStrategy mr) {
        super();
        this.moveStrategy = mr;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.gray);
        graphics.fillOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 20, 20);
        graphics.setColor(Color.white);
    }
}
