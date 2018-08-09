package ch3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b=true;
        System.out.println("b: "+b);
        b=false;
        System.out.println("b: "+b);

        if(b)
            System.out.println("b is true");
        else
            System.out.println("b is false");
        b=true;
        if(b)
            System.out.println("b is true");

        System.out.println("10>9 "+(10>9));


    }
}
