package main.java.com.mokhov.ch5;

public class BreakLoop4 {
    public static void main(String[] args) {

       outer: for (int i = 0; i < 3 ; i++) {
                for (int j = 0; j <100 ; j++) {
               if(j==10){
                   System.out.println("break");
                   break outer;
               }
                    System.out.println("inner loop " + j);
           }
           System.out.println("outer loop");
        }
        System.out.println("end");
    }
}
