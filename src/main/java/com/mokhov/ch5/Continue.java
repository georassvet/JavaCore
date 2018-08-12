package main.java.com.mokhov.ch5;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
