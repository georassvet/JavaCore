package main.java.com.mokhov.ch6;

public class Box1 {
    double width;
    double height;
    double depth;

    double getVolume(){
        return width*height*depth;
    }

    void setDimensions(double width,double height,double depth){
        this.width=width;
        this.depth=depth;
        this.height=height;
    }
}
