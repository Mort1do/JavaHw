package Hw6N10;

public class Monitor {
    float screenSize;
    int hz;
    int resolution;

    Monitor(float screenSize) {
        this.resolution = resolution;
        this.hz = hz;
        this.screenSize = screenSize;
    }

    float getScreenSize () {return screenSize;}
    void setScreenSize (float screenSize) {this.screenSize = screenSize;}

    int getHz () {return hz;}
    void setHz (int hz) {this.hz = hz;}

    int getResolution () {return resolution;}
    void setResolution (int resolution) {this.resolution = resolution;}
}
