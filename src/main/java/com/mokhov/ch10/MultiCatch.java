package main.java.com.mokhov.ch10;

public class MultiCatch {
    public static void main(String[] args) {
        int a=10, b =0;
        int[] array = {2,14,4,5};
        try{
        //    int c = a/b;
            array[10]=99;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }

    }
}
