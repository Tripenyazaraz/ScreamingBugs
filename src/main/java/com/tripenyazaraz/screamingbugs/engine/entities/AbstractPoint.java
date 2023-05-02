package com.tripenyazaraz.screamingbugs.engine.entities;

import com.tripenyazaraz.screamingbugs.engine.data_types.Vector2;
import javafx.scene.paint.Color;

public class AbstractPoint {

    public Vector2 coords;
    public Vector2 direction;
    public Vector2 velocity;
    public float diameter = 2;
    public float radius = diameter / 2;
    public Color color;

    public AbstractPoint() {
        this(new Vector2(), new Vector2(), new Vector2());
    }

    public AbstractPoint(float x, float y, float dx, float dy, float vx, float vy) {
        this(new Vector2(x, y), new Vector2(dx, dy), new Vector2(vx, vy));
    }

    public AbstractPoint(Vector2 coords, Vector2 direction, Vector2 velocity) {
        this.coords = coords;
        this.direction = direction;
        this.velocity = velocity;
    }

    public Vector2 getCoords() {
        return this.coords;
    }

    public void setCoords(Vector2 coords) {
        this.coords = coords;
    }

    public Vector2 getDirection() {
        return this.direction;
    }

    public void setDirection(Vector2 direction) {
        this.direction = direction;
    }

    public Vector2 getVelocity() {
        return this.velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public float getDiameter() {
        return this.diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void run(int width, int height) {}
}
