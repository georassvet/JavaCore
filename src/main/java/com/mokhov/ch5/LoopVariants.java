package main.java.com.mokhov.ch5;

public class LoopVariants {
    public static void main(String[] args) {

        boolean check =false;
        System.out.println("Start 1 example");
        for (int i = 0; !check ; i++) {
            if(i==100){
                check=true;
            }
        }
        System.out.println("Loop 1 exit");
        System.out.println("Start 2 example");
        check =false;
        int i=0;
        for(;!check;){
            System.out.println(i);
            if(i==100){
                check=true;
            }
            i++;
        }
        System.out.println("Loop 2 exit");
    }
}
