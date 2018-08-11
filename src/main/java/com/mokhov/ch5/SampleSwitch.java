package main.java.com.mokhov.ch5;

public class SampleSwitch {
    public static void main(String[] args) {


        for (int i = 0;; i++) {
            switch (i){
                case 1:{
                    System.out.println("i is one");
                    break;
                }
                case 2:{
                    System.out.println("i is two. no break.");

                }
                case 3:{
                    System.out.println("i is three");
                    break;
                }
                default:{
                    System.out.println(i+" is unknown");
                    break;
                }
            }
        }
        //System.out.println("end");
    }
}
