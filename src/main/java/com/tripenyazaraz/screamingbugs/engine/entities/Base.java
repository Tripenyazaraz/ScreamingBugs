package com.tripenyazaraz.screamingbugs.engine.entities;

import com.tripenyazaraz.screamingbugs.engine.data_types.Vector2;
import javafx.scene.paint.Color;

public class Base extends AbstractPoint {

    public Base() {
        this(new Vector2(), new Vector2(), new Vector2());
    }

    public Base(float x, float y, float dx, float dy, float vx, float vy) {
        this(new Vector2(x, y), new Vector2(dx, dy), new Vector2(vx, vy));
    }

    public Base(Vector2 coords, Vector2 direction, Vector2 velocity) {
        super(coords, direction, velocity);

        this.diameter = 10;
        this.radius = this.diameter / 2;
        this.color = Color.RED;
    }

    @Override
    public void run(int width, int height) {

    }
}
