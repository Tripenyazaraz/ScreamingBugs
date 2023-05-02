package com.tripenyazaraz.screamingbugs.engine.entities;

import com.tripenyazaraz.screamingbugs.engine.data_types.Vector2;

public class Base extends AbstractPoint {
    public Base() {
        super();
    }

    public Base(Vector2 coords, Vector2 direction, Vector2 velocity) {
        super(coords, direction, velocity);
    }

    public Base(float x, float y, float dx, float dy, float vx, float vy) {
        super(x, y, dx, dy, vx, vy);
    }
}
