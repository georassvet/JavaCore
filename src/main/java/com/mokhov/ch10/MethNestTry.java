package main.java.com.mokhov.ch10;

public class MethNestTry {

    static void meth(int a){
        try{
            if(a==1){
                System.out.println("a="+a);
                a=a/(a-a);
            }
            if(a==2){
                System.out.println("a="+a);
                int[] c ={1};
                c[44]=55;
            }
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Inner" + ex);
        }

    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;

            meth(a);

        }catch (ArithmeticException ex){
            System.out.println("Outer" + ex);
        }
    }
}
