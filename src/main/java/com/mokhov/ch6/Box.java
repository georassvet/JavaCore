package main.java.com.mokhov.ch6;

public class Box {
    double width;
    double height;
    double depth;

    double getVolume(){
        return width*height*depth;
    }

    Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
//    void setDimensions(double width,double height,double depth){
//        this.width=width;
//        this.depth=depth;
//        this.height=height;
//    }
}
