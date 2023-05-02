package com.tripenyazaraz.screamingbugs.fx;

import com.tripenyazaraz.screamingbugs.engine.Engine;
import com.tripenyazaraz.screamingbugs.engine.entities.AbstractPoint;
import com.tripenyazaraz.screamingbugs.engine.entities.Bug;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class ScreamingBugsController {
    Engine engine;

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
}