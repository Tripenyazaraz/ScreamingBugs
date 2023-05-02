package com.tripenyazaraz.screamingbugs.engine.entities;

import com.tripenyazaraz.screamingbugs.engine.data_types.Vector2;

public class Bug extends AbstractPoint {

    public Bug() {
        super();
    }

    public Bug(Vector2 coords, Vector2 direction, Vector2 velocity) {
        super(coords, direction, velocity);
    }

    public Bug(float x, float y, float dx, float dy, float vx, float vy) {
        super(x, y, dx, dy, vx, vy);
    }

}
