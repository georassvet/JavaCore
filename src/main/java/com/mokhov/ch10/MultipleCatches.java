package main.java.com.mokhov.ch10;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 42 / a;

            int[] c = {1};
            c[44]=10;
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        System.out.println("Last statement");
    }
}
