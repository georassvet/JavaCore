package main.java.com.mokhov.ch5;

public class ForEachNoChange {
    public static void main(String[] args) {
        int[] arr ={10,11,5,8,7,21,32};

        for (int x:arr
             ) {
            x=x*10;
        }
        System.out.println("After for-each change");
        for (int x:arr
             ) {
            System.out.print(x + " ");
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]*10;
        }
        System.out.println("\nAfter for change");
        for (int x:arr
                ) {
            System.out.print(x + " ");
        }



    }
}
