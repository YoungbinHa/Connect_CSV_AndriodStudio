package com.example.myapplication;

import org.w3c.dom.Text;

import java.util.Map;

class LibSample {
    private String Floor;
    private int lownumber;
    private int highnumber;
    private String Beginning;
    private String Ending;
    private String Map;
    private String Text;

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }

    public int getLownumber() {
        return lownumber;
    }

    public void setLownumber(int lownumber) {
        this.lownumber = lownumber;
    }

    public int getHighnumber() {
        return highnumber;
    }

    public void setHighnumber(int highnumber) {
        this.highnumber = highnumber;
    }

    public String getBeginning() {
        return Beginning;
    }

    public void setBeginning(String beginning) {
        Beginning = beginning;
    }

    public String getEnding() {
        return Ending;
    }

    public void setEnding(String ending) {
        Ending = ending;
    }

    public String getMap() {
        return Map;
    }

    public void setMap(String map) {
        Map = map;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    @Override
    public String toString() {
        return "LibSample{" +
                "Floor='" + Floor + '\'' +
                ", lownumber=" + lownumber +
                ", highnumber=" + highnumber +
                ", Beginning='" + Beginning + '\'' +
                ", Ending='" + Ending + '\'' +
                ", Map='" + Map + '\'' +
                ", Text='" + Text + '\'' +
                '}';
    }
}
