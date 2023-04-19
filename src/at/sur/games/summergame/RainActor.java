package at.sur.games.summergame;

import at.sur.games.summergame.MoveStrategy;
import org.newdawn.slick.*;

public class RainActor  implements Actor{

    private MoveStrategy moveStrategy;

    public RainActor(MoveStrategy mr) {
        super();
        this.moveStrategy = mr;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.blue);
        graphics.fillRect(moveStrategy.getX(), moveStrategy.getY(), 5, 5);
        graphics.setColor(Color.white);
    }
}
