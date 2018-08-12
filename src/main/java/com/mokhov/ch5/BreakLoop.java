package main.java.com.mokhov.ch5;

public class BreakLoop {
    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            if(i==10){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        int i=0;
        while(i<100){
            if(i==10){
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 0; j <3 ; j++) {
            System.out.print("Pass"+j+": ");
            for (int k = 0; k <100 ; k++) {
                if(k==10){
                    break;
                }
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

}
