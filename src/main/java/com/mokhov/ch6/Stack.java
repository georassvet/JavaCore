package main.java.com.mokhov.ch6;

public class Stack {

    int[] arr;
    int pos;

    Stack(int size){
        arr=new int[size];
        pos=-1;
    }
    int pop(){
        if (pos<0){
            return 0;
        }else {
            return arr[pos--];
        }

    }
   void push(int num){
        if(pos>=arr.length-1){
            System.out.println("Stack is full.");
        }
        else {
            arr[++pos] = num;
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
class UseStack{
    public static void main(String[] args) {
        Stack stack =new Stack(5);
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(2);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(11);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }

}
