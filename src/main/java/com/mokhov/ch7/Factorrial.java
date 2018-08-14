package main.java.com.mokhov.ch7;

public class Factorrial {

    int factorial(int num){
        if(num == 1 || num ==0){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }

    public static void main(String[] args) {
        Factorrial factorrial =new Factorrial();
        System.out.println("10!="+factorrial.factorial(10));
        System.out.println("2!="+factorrial.factorial(2));
        System.out.println("1!="+factorrial.factorial(1));
        System.out.println("0!="+factorrial.factorial(0));
        System.out.println("3!="+factorrial.factorial(3));
        System.out.println("03!="+factorrial.factorial(03));
        System.out.println("4!="+factorrial.factorial(4));




    }
}

