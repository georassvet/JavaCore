package main.java.com.mokhov.ch15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        MyIface myIface = (k)-> k % 2 == 0;
        if(myIface.test(10)){
            System.out.println("even number");
        }
        if(!myIface.test(11)){
            System.out.println("odd number");
        }

        myIface = (k -> k>=0);

        for (int i = 10; i > -5 ; i--) {
            if(myIface.test(i)){
                System.out.println("positive "+i);
            }
            else{
                System.out.println("negative " + i);
            }
        }



    }
}
interface MyIface {
    boolean test(int k);
}
