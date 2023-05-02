package com.tripenyazaraz.screamingbugs.engine.entities;

import com.tripenyazaraz.screamingbugs.engine.data_types.Vector2;

public class AbstractPoint {

    private Vector2 coords;
    private Vector2 direction;
    private Vector2 velocity;
    private float diameter = 2;
    private float radius = diameter / 2;

    public AbstractPoint() {
        this.coords = new Vector2();
        this.direction = new Vector2();
        this.velocity = new Vector2();
    }

    public AbstractPoint(Vector2 coords, Vector2 direction, Vector2 velocity) {
        this.coords = coords;
        this.direction = direction;
        this.velocity = velocity;
    }

    public AbstractPoint(float x, float y, float dx, float dy, float vx, float vy) {
        this.coords = new Vector2(x, y);
        this.direction = new Vector2(dx, dy);
        this.velocity = new Vector2(vx, vy);
    }

    public Vector2 getCoords() {
        return coords;
    }

    public void setCoords(Vector2 coords) {
        this.coords = coords;
    }

    public Vector2 getDirection() {
        return direction;
    }

    public void setDirection(Vector2 direction) {
        this.direction = direction;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
