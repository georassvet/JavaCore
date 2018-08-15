package main.java.com.mokhov.ch8;

public class FigureTest {
    public static void main(String[] args) {
        Figure figure;// =new Figure(10,11);
        Rectangle rectangle =new Rectangle(12,13);
        Triangle triangle =new Triangle(13,14);

        //figure.area();
        figure=rectangle;
        figure.area();
        figure=triangle;
        figure.area();
    }
}
