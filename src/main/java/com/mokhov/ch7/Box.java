package main.java.com.mokhov.ch7;

public class Box {

    double width;
    double height;
    double depth;

    double getVolume(){
        return  width*height*depth;
    }
    Box(Box box){
        this.height=box.height;
        this.width=box.width;
        this.depth=box.depth;
    }
    Box(){
        this.width=-1;
        this.height=-1;
        this.depth=-1;
    }
    Box(double width){
        this.height=this.width=this.depth=width;
    }
    Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

}
