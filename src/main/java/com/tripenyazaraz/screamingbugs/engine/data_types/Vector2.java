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

    private float getLength() {
        return (float)Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    private void normalize() {
        float l = this.getLength();
        this.x = this.x / l;
        this.y = this.y / l;
    }
}
