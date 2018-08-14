package main.java.com.mokhov.ch7;

public class Stack {
    private  int[] array;
    private int pos;

    Stack(int size){
        array =new int[size];
        pos=-1;
    }
    void push(int value){
        if(pos==array.length-1){
            System.out.println("Stack is full.");
        }
        else{
            array[++pos]=value;
        }
    }
    int pop(){
        if(pos<0){
            System.out.println("Stack underflow.");
            return 0;
        }else{
            return array[pos--];
        }
    }


}
