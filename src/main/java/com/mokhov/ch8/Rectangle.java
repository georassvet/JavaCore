package main.java.com.mokhov.ch8;

public class Rectangle extends Figure {

    Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }

    double area(){
        System.out.println("Rectangle area is "+ dim1*dim2);
        return dim1*dim2;
    }

}
