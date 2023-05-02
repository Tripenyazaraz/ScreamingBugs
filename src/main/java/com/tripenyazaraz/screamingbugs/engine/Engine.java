package com.tripenyazaraz.screamingbugs.engine;

import com.tripenyazaraz.screamingbugs.engine.entities.AbstractPoint;

import java.util.ArrayList;

public class Engine {

    public int width = 1000;
    public int height = 1000;

    private ArrayList<AbstractPoint> points = new ArrayList<>();
    private boolean isStopped = false;
    private int physicsTimeout = 10;

    public void run() {
        while (true) {
            try {
                Thread.sleep(this.physicsTimeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!isStopped) {
                for (AbstractPoint point : points) {
                    point.run(this.width, this.height);
                }
            }
        }
    }

    public void pause() {
        this.isStopped = true;
    }

    public void release() {
        this.isStopped = false;
    }

    public int getPhysicsTimeout() {
        return physicsTimeout;
    }

    public void setPhysicsTimeout(int physicsTimeout) {
        this.physicsTimeout = physicsTimeout;
    }

    public ArrayList<AbstractPoint> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<AbstractPoint> points) {
        this.points = points;
    }

    public void addPoint(AbstractPoint point) {
        this.points.add(point);
    }

}
