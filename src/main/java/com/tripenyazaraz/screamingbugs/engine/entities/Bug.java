package com.tripenyazaraz.screamingbugs.engine.entities;

import com.tripenyazaraz.screamingbugs.engine.data_types.Vector2;
import javafx.scene.paint.Color;

public class Bug extends AbstractPoint {

    public Bug() {
        this(new Vector2(), new Vector2(), new Vector2());
    }

    public Bug(float x, float y, float dx, float dy, float vx, float vy) {
        this(new Vector2(x, y), new Vector2(dx, dy), new Vector2(vx, vy));
    }

    public Bug(Vector2 coords, Vector2 direction, Vector2 velocity) {
        super(coords, direction, velocity);

        this.diameter = 2;
        this.radius = this.diameter / 2;
        this.color = Color.WHITE;
    }

    @Override
    public void run(int width, int height) {
        Vector2 newCoords = this.coords.plus(this.direction.multiply(this.velocity));
        if (newCoords.x > width || newCoords.x < 0) {
            this.velocity.x *= -1;
        }
        if (newCoords.y > height || newCoords.y < 0) {
            this.velocity.y *= -1;
        }

        this.coords = this.coords.plus(this.direction.multiply(this.velocity));
    }

}
