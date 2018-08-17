package main.java.com.mokhov.ch9;

import java.util.Random;

class FixedStack implements StackInterface{

    int[] array;
    int pos;

    FixedStack(int size){
        array =new int[size];
        pos=-1;
    }

    @Override
    public void push(int item) {
        if(pos==array.length-1){
            System.out.println("Fixed stack is full");
        }
        else{
            array[++pos]=item;
        }
    }
    @Override
    public int pop() {
        if(pos<0){
            System.out.println("Fixed stack is empty");
            return 0;
        }
        return array[pos--];
    }


}

class DynamicStack implements StackInterface{

    int[] array;
    int pos;

    DynamicStack(){
        array =new int[10];
        pos=-1;
    }
    void updateSize(){
        int[] newArray = new int[array.length+10];
        for (int i = 0; i <array.length ; i++) {
            newArray[i]=array[i];
        }
        array = newArray;
    }

    @Override
    public void push(int t) {
        if(pos==array.length-1)
            updateSize();
            array[++pos] = t;
    }
    @Override
    public int pop() {
        return pos<0 ? 0 : array[pos--];
    }

}

public class StackClassesTest {
    public static void main(String[] args) {
        StackInterface dynamic = new DynamicStack();
        StackInterface fixed =new FixedStack(10);
        Random random = new Random(47);
        for (int i = 0; i < 12 ; i++) {
            int rand =random.nextInt(100);
            dynamic.push(rand);
            fixed.push(rand);
        }

        dynamic.printArray(10);

    }
}
