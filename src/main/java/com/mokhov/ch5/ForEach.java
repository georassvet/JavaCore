package main.java.com.mokhov.ch5;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,4,5,1,3,5,5,5};
        int sum = 0;
        for (int x:arr
             ) {
            sum+=x;
            System.out.println(x);
        }
        double d = sum/arr.length;
        System.out.println("sum "+sum);
        System.out.println("avg "+d);
    }
}
