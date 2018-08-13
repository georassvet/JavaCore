package main.java.com.mokhov.ch6;


import java.util.Random;

class Stack1{
    int[] arr;
    int pos;

    Stack1(int size){
        arr =new int[size];
        pos=0;
    }

    int pop(){
        if(pos<=0){
            return 0;
        }
        return arr[pos-- -1];
    }
    void push(int num){
        if(pos>=arr.length){
            System.out.println("Stack is full");
        }
        else {
            arr[pos++] = num;
        }
    }

    @Override
    public String toString() {
        String s="";
        for (int i:arr
             ) {
            s+=i+" ";
        }
        return s;
    }
}

public class MyStack {
    public static void main(String[] args) {
        Stack1 stack =new Stack1(10);
        Random random =new Random(47);

        for(int i=0;i<13;i++){
            stack.push(random.nextInt(100));
        }
        System.out.println(stack);
        for(int i=0;i<13;i++){
            System.out.print(" pop "+stack.pop());
        }
        for(int i=0;i<13;i++){
            stack.push(random.nextInt(100));
        }
        System.out.println(stack);
    }
}
