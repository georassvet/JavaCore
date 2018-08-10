package main.java.com.mokhov.ch4;

public class BasicMath {
    public static void main(String[] args) {
        int a = 10*3;
        int b = 2/5;
        int c = 3+29;
        int d = 3-29;
        int e = 3%8;
        int f = 10;
        int g=f--;
        print(a,b,c,d,e,f,g);

        double da = 0.5*2.3;
        double db = 2.2 / 3.4;
        double dc = 5.4 + 1.8;
        double dd = 3.1 - 3.7;
        double de = 3.1 % 3.7;
        double df = de++;
        double dg = df--;

        print(da,db,dc,dd,de,df,dg);



    }
    static <T> void print(T a ,T b, T c, T d, T e, T f, T g){
        System.out.println("Multiplication "+a);
        System.out.println("Division "+b);
        System.out.println("Addition "+c);
        System.out.println("Substaraction "+d);
        System.out.println("Modulus "+e);
        System.out.println("Increment "+f);
        System.out.println("Decrement "+g);


    }
}
