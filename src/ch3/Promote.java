package ch3;

public class Promote {
    public static void main(String[] args) {
        byte b = 100;
        short s = 32000;
        int i= 2_000_000_000;
        long l = 3214L;
        float f =5.67f;
        double d = .1234;
        char c = '\123';


       double resultDouble = b*l+f*s+d*i+c;
       float resultFloat = b*l+f*s+i+c;
       long resultLong = b*l+s+i+c;
       int resultInt = b+s+c;
       int resultShort = b+s+c;

    }
}
