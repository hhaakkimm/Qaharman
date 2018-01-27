package Q_package;

/**
 * Created by nurik on 1/28/18.
 */

public class QPoint {
    public int lat;
    public int lon;
    public int qtime;

    public QPoint() {}

    public QPoint(int lat, int lon, int qtime) {
        this.lat = lat;
        this.lon = lon;
        this.qtime = qtime;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public void setQtime(int qtime) {
        this.qtime = qtime;
    }

    public int getLat() {
        return lat;
    }

    public int getLon() {
        return lon;
    }

    public int getQtime() {
        return qtime;
    }

    @Override
    public String toString() {
        return this.qtime+" "+this.lon+" "+this.lat;
    }

}
