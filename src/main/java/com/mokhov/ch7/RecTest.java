package main.java.com.mokhov.ch7;

import java.util.Random;

public class RecTest {
    int[] arr;
    RecTest(int arrSize){
        arr=new int[arrSize];
    }
    void printArray(int i){
        if(i==0)return;
        else printArray(i-1);
        System.out.println(arr[i-1]);
    }



}
class  Recursion2{
    public static void main(String[] args) {
        RecTest recTest =new RecTest(10);
        Random random = new Random(47);
        for (int i = 0; i <recTest.arr.length ; i++) {
            recTest.arr[i]=random.nextInt(100);
        }

        recTest.printArray(10);

    }
}
