package main.java.com.mokhov.ch5;

public class NoBody {
    public static void main(String[] args){
        int i,j;
        i=150;
        j=150;

        while(++i<--j);
        System.out.println("Midpoint: i: "+i +" j: "+ j);
    }
}
