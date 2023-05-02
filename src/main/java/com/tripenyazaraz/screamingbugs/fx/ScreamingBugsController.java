package com.tripenyazaraz.screamingbugs.fx;

import com.tripenyazaraz.screamingbugs.engine.Engine;
import com.tripenyazaraz.screamingbugs.engine.entities.AbstractPoint;
import com.tripenyazaraz.screamingbugs.engine.entities.Base;
import com.tripenyazaraz.screamingbugs.engine.entities.Bug;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ScreamingBugsController {
    Engine engine;
    private final int renderTimeout = 10;

    @FXML
    private Canvas canvas;

    @FXML
    protected void onButtonPause() {
        this.engine.pause();
    }

    @FXML
    protected void onButtonRelease() {
        this.engine.release();
    }

    @FXML
    public void initialize() {
        this.engine = new Engine();
        this.engine.addPoint(new Bug(1,1, 0.5f,1, 1,1));
        this.engine.addPoint(new Base(100,100, 0,0, 0,0));

        new Thread(() -> engine.run()).start();

        GraphicsContext context = canvas.getGraphicsContext2D();
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(renderTimeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                context.setFill(Color.BLACK);
                context.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

                for (AbstractPoint point : this.engine.getPoints()) {
                    context.setFill(point.color);
                    context.fillOval(point.coords.x, point.coords.y, point.diameter, point.diameter);
                }
            }
        }).start();
    }
}
