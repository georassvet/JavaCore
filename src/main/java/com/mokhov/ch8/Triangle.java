package main.java.com.mokhov.ch8;

public class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
        double area() {
            System.out.println("Trinagle area is "+dim1*dim2/2);
            return dim1*dim2/2;
    }
}
