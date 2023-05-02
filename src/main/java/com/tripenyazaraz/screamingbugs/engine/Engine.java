package com.tripenyazaraz.screamingbugs.engine;

import com.tripenyazaraz.screamingbugs.engine.entities.AbstractPoint;

import java.util.ArrayList;

public class Engine {

    private ArrayList<AbstractPoint> points = new ArrayList<>();
    private boolean isStopped = false;

    public void run() {
        while (true) {
            if (!isStopped) {
//                System.out.println("run");
            }
        }
    }

    public void pause() {
        this.isStopped = true;
    }

    public void release() {
        this.isStopped = false;
    }

    public ArrayList<AbstractPoint> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<AbstractPoint> points) {
        this.points = points;
    }
}
