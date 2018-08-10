package main.java.com.mokhov.ch4;

public class BinaryTest {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        System.out.println(a + " ->" + Integer.toBinaryString(a));
        int b = 4;
        System.out.println(b + " ->" + Integer.toBinaryString(b));
        int c;

        for (int i = 0; i <32 ; i++) {
            c=a>>>i;
            System.out.println(a+" >>> " +i + " = "+ c + " -> "+Integer.toBinaryString(c));
        }


//        11111111_11111111_11010100_01100001
//        11111111_11111111_11010100_0110000
    }
}
