package com.example.myapplication;

import org.w3c.dom.Text;

import java.util.Map;

class LibSample {
    private String floor;
    private String range;
    private String beginning;
    private String map;
    private String rext;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getBeginning() {
        return beginning;
    }

    public void setBeginning(String beginning) {
        this.beginning = beginning;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getRext() {
        return rext;
    }

    public void setRext(String rext) {
        this.rext = rext;
    }

    @Override
    public String toString() {
        return "LibSample{" +
                "floor='" + floor + '\'' +
                ", range='" + range + '\'' +
                ", beginning='" + beginning + '\'' +
                ", map='" + map + '\'' +
                ", rext='" + rext + '\'' +
                '}';
    }
}
