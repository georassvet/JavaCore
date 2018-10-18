package main.java.com.mokhov.ch15;

interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        int n  = 10;

        MyFunc myFunc = (k)->{
          int sum = 10 + n;
          return sum;
        };

        // n=9;
        System.out.println(myFunc.func(n));

    }
}
