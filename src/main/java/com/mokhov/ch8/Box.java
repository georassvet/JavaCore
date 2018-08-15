package main.java.com.mokhov.ch8;

public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box box){
        this.width=box.width;
        this.height =box.height;
        this.depth=box.depth;
    }
    Box(int width){
        this.width=this.height=this.depth=width;
    }
    Box(double width,double height,double depth){
        this.depth=depth;
        this.width=width;
        this.height=height;
    }
    Box(){
        this.width=-1;
        this.height=-1;
        this.depth=-1;
    }

    public double getVolume(){
        return this.depth*this.height*this.width;
    }
}
class BoxWeight extends Box{
    private double weigth;
    BoxWeight(double weight, double height, double width, double depth){
        super(width,height,depth);
        this.weigth=weight;
    }

}

class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight boxWeight =new BoxWeight(12,23,12,32);
        System.out.println(boxWeight.getVolume());

        Box  box=new Box(10);
        System.out.println(box.getVolume());
    }
        }
class ColorBox extends Box{
   private String colorName;
    ColorBox(String colorName, double width, double height, double depth){
        super(width,height,depth);
        this.colorName=colorName;
    }
}