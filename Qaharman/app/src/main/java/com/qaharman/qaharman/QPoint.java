package com.qaharman.qaharman;

import java.util.Date;

/**
 * Created by nurik on 1/28/18.
 */

public class QPoint {
    public double lat;
    public double lon;
    public Date qtime;

    public QPoint() {}

    public QPoint(double lat, double lon, Date qtime) {
        this.lat = lat;
        this.lon = lon;
        this.qtime = qtime;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setQtime(Date qtime) {
        this.qtime = qtime;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public Date getQtime() {
        return qtime;
    }

    @Override
    public String toString() {
        return this.qtime+" "+this.lon+" "+this.lat;
    }

}
