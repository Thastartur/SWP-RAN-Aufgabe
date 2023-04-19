package at.sur.games.summergame;

import at.sur.games.summergame.*;
import at.sur.games.summergame.Actor;
import at.sur.games.summergame.MoveStrategy;
import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;


import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame{

    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn des Spieles
        this.actors = new ArrayList<>();

        //Wolken
        MoveStrategy mr1 = new MoveSun(-100, 30, 0.03f);
        MoveStrategy mr2 = new MoveCloud(500, 150, 0.09f);
        MoveStrategy mr3 = new MoveSun(100, 175, 0.1f);
        MoveStrategy mr4 = new MoveCloud(200, 200, 0.07f);

        this.actors.add (new CloudActor(mr2));
        this.actors.add (new CloudActor(mr3));
        this.actors.add (new CloudActor(mr4));

        //Sonne
        SunActor s1 = new SunActor(mr1);

        this.actors.add (s1);

        // Regen
        MoveStrategy mr10 = new MoveRain(50, -20, 0.01f);
        MoveStrategy mr16 = new MoveRain(100, -20, 0.01f);
        MoveStrategy mr17 = new MoveRain(150, -20, 0.01f);
        MoveStrategy mr18 = new MoveRain(200, -20, 0.01f);
        MoveStrategy mr19 = new MoveRain(250, -20, 0.01f);
        MoveStrategy mr20 = new MoveRain(300, -20, 0.01f);
        MoveStrategy mr21 = new MoveRain(350, -20, 0.01f);
        MoveStrategy mr22 = new MoveRain(400, -20, 0.01f);
        MoveStrategy mr23 = new MoveRain(450, -20, 0.01f);
        MoveStrategy mr24 = new MoveRain(500, -20, 0.01f);
        MoveStrategy mr25 = new MoveRain(550, -20, 0.01f);
        MoveStrategy mr26 = new MoveRain(600, -20, 0.01f);
        MoveStrategy mr27 = new MoveRain(650, -20, 0.01f);
        MoveStrategy mr28 = new MoveRain(700, -20, 0.01f);
        MoveStrategy mr29 = new MoveRain(750, -20, 0.01f);

        RainActor r1 = new RainActor(mr10);
        RainActor r2 = new RainActor(mr16);
        RainActor r3 = new RainActor(mr17);
        RainActor r4 = new RainActor(mr18);
        RainActor r5 = new RainActor(mr19);
        RainActor r6 = new RainActor(mr20);
        RainActor r7 = new RainActor(mr21);
        RainActor r8 = new RainActor(mr22);
        RainActor r9 = new RainActor(mr23);
        RainActor r10 = new RainActor(mr24);
        RainActor r11 = new RainActor(mr25);
        RainActor r12 = new RainActor(mr26);
        RainActor r13 = new RainActor(mr27);
        RainActor r14 = new RainActor(mr28);
        RainActor r15 = new RainActor(mr29);

        this.actors.add (r1);
        this.actors.add (r2);
        this.actors.add (r3);
        this.actors.add (r4);
        this.actors.add (r5);
        this.actors.add (r6);
        this.actors.add (r7);
        this.actors.add (r8);
        this.actors.add (r9);
        this.actors.add (r10);
        this.actors.add (r11);
        this.actors.add (r12);
        this.actors.add (r13);
        this.actors.add (r14);
        this.actors.add (r15);

        s1.addObserver((Observer) mr10);
        s1.addObserver((Observer) mr16);
        s1.addObserver((Observer) mr17);
        s1.addObserver((Observer) mr18);
        s1.addObserver((Observer) mr19);
        s1.addObserver((Observer) mr20);
        s1.addObserver((Observer) mr21);
        s1.addObserver((Observer) mr22);
        s1.addObserver((Observer) mr23);
        s1.addObserver((Observer) mr24);
        s1.addObserver((Observer) mr25);
        s1.addObserver((Observer) mr26);
        s1.addObserver((Observer) mr27);
        s1.addObserver((Observer) mr28);
        s1.addObserver((Observer) mr29);

        //Bäume
        MoveStrategy mr5 = new MoveCloud(70, 500, 0f);
        MoveStrategy mr6 = new MoveCloud(140, 510, 0f);
        MoveStrategy mr7 = new MoveCloud(210, 490, 0f);
        MoveStrategy mr8 = new MoveCloud(280, 500, 0f);
        MoveStrategy mr9 = new MoveCloud(350, 515, 0f);
        MoveStrategy mr11 = new MoveCloud(420, 505, 0f);
        MoveStrategy mr12 = new MoveCloud(490, 495, 0f);
        MoveStrategy mr13 = new MoveCloud(560, 500, 0f);
        MoveStrategy mr14 = new MoveCloud(630, 495, 0f);
        MoveStrategy mr15 = new MoveCloud(700, 515, 0f);

        TreeActor t1 = new TreeActor(mr5);
        TreeActor t2 = new TreeActor(mr6);
        TreeActor t3 = new TreeActor(mr7);
        TreeActor t4 = new TreeActor(mr8);
        TreeActor t5 = new TreeActor(mr9);
        TreeActor t6 = new TreeActor(mr11);
        TreeActor t7 = new TreeActor(mr12);
        TreeActor t8 = new TreeActor(mr13);
        TreeActor t9 = new TreeActor(mr14);
        TreeActor t10 = new TreeActor(mr15);

        this.actors.add (t1);
        this.actors.add (t2);
        this.actors.add (t3);
        this.actors.add (t4);
        this.actors.add (t5);
        this.actors.add (t6);
        this.actors.add (t7);
        this.actors.add (t8);
        this.actors.add (t9);
        this.actors.add (t10);

        s1.addColorObserver(t1);
        s1.addColorObserver(t2);
        s1.addColorObserver(t3);
        s1.addColorObserver(t4);
        s1.addColorObserver(t5);
        s1.addColorObserver(t6);
        s1.addColorObserver(t7);
        s1.addColorObserver(t8);
        s1.addColorObserver(t9);
        s1.addColorObserver(t10);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        // delta = Zeit seit dem letzten Aufruf
        for (Actor actor: this.actors) {
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // gezeichnet
        for (Actor actor: this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.sur.games.summergame.MainGame("Sommer Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
