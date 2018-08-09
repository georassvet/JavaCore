package ch3;

public class Conversion {
    public static void main(String[] args) {
        byte b;

        int i =128;
        double d =323.142;

        b=(byte)i;
        System.out.println("b=(byte)i; "+ b);
        i=(int)d;
        System.out.println("i=(int)d; "+i);
        b=(byte)d;
        System.out.println("b=(byte)d; "+b);
        System.out.println(Byte.MIN_VALUE+" -> "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" -> "+Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" -> "+Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+ " -> "+Long.MAX_VALUE );
        System.out.println(Float.MIN_VALUE+ " -> "+Float.MAX_VALUE );
        System.out.println(Double.MIN_VALUE+ " -> "+Double.MAX_VALUE );
        System.out.println(Character.MIN_VALUE+" -> "+Character.MAX_VALUE);
    }
}
