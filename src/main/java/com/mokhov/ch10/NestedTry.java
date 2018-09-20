package main.java.com.mokhov.ch10;

public class NestedTry {
    public static void main(String[] args) {
        try{
            int a =args.length;
            int b = 42 / a;

            try{
                if (a==1){
                    a=a/(a-a);
                }
                if(a==2){
                    int[] c ={};
                    c[44]=55;
                }
            }catch (ArithmeticException ex){
                System.out.println("Inner 1" + ex);
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println("Inner 2" + ex);
            }
        }catch (ArithmeticException ex){
            System.out.println("Outer" + ex);
        }
    }
}
