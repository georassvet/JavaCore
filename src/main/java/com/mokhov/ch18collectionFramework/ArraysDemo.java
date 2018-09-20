package main.java.com.mokhov.ch18collectionFramework;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=-3*i;
        }
        display(arr);
        Arrays.sort(arr);

        display(arr);
       Arrays.fill(arr,0,3,-6);
       display(arr);
       Arrays.sort(arr);
       display(arr);



    }
    static void display(int[] a){
        for (int i :a
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
