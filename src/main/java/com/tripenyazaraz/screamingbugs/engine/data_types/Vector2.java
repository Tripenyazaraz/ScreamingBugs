package com.tripenyazaraz.screamingbugs.engine.data_types;

public class Vector2 {
    public float x;
    public float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2() {
        this.x = 0;
        this.y = 0;
    }

    public float getLength() {
        return (float)Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void normalize() {
        float l = this.getLength();
        this.x = this.x / l;
        this.y = this.y / l;
    }

    public Vector2 plus(Vector2 v) {
        return new Vector2(this.x + v.x, this.y + v.y);
    }

    public Vector2 minus(Vector2 v) {
        return new Vector2(this.x - v.x, this.y - v.y);
    }

    public Vector2 multiply(Vector2 v) {
        return new Vector2(this.x * v.x, this.y * v.y);
    }

    public Vector2 divide(Vector2 v) {
        return new Vector2(this.x / v.x, this.y / v.y);
    }
}
