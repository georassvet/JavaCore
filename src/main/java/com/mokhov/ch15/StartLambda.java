package main.java.com.mokhov.ch15;

public class StartLambda {
    public static void main(String[] args) {
        MyFuncInt myFuncInt = (x, y) -> x*y ;

        System.out.println("(x, y) -> x*y = " + myFuncInt.getSquare(10,12));

        myFuncInt  = (x, y) -> x / y;

        System.out.println("(x, y) -> x / y = " + myFuncInt.getSquare(10,5));

    }
}
interface MyFuncInt{
    int getSquare(int x, int y);
}
