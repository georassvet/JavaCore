package main.java.com.mokhov.ch4;

public class OpBitEquals {
    public static void main(String[] args) {
        int a =1;
        int b=2;
        int c=3;

        a|=4;
        b>>=1;
        c<<=1;
        a^=c;
        System.out.println("a|=4; "+ a);
        System.out.println("b>>1; "+ b);
        System.out.println("c<<1; "+ c);
    }
}
