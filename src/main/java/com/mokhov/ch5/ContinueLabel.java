package main.java.com.mokhov.ch5;

public class ContinueLabel {
    public static void main(String[] args) {
       one: for (int i = 0; i < 10 ; i++) {
           for (int j = 0; j < 10; j++) {
               if (j > i) {
                   System.out.println();
                   continue one;
               }
               System.out.print(j + " ");
           }
       }
        System.out.println();
    }
}
