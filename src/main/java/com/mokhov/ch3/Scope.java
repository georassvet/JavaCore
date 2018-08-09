package ch3;

public class Scope {

    public static void main(String[] args) {
        int x;
        x=100;
        if(x==100){
            int y=20;
            y=y*x;
            System.out.println("y "+y+" x "+x);
        }
        System.out.println("y "+" x "+x);
    }

}
