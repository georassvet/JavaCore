package main.java.com.mokhov.ch15;

public class BlockLambdaDemo {
    public static void main(String[] args) {

        MyInface myInface = (x)->{
            int sum=1;
            for (int i = x; i >0 ; i--) {
                sum*=i;
            }
            return sum;
        };

        System.out.println(myInface.test(3));
        System.out.println(myInface.test(4));
        System.out.println(myInface.test(5));
        System.out.println(myInface.test(6));
        System.out.println(myInface.test(7));
        System.out.println(myInface.test(8));
        System.out.println(myInface.test(9));
        System.out.println(myInface.test(10));
        System.out.println(myInface.test(11));
        System.out.println(myInface.test(12));



    }
}
interface MyInface{
    int test(int val);
}
