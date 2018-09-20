package main.thinkingInJava.collections;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> storage =new LinkedList<>();

    public void push(T v){ storage.addFirst(v); }
    public T peek(){return storage.getFirst(); }
    public T pop(){ return storage.removeFirst(); }
    public  boolean empty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
class StackEx{
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        for(String i : "Hello world and all country in the world".split(" ")){
            stack.push(i);
        }
        System.out.println(stack.peek());
        System.out.println(stack);
        while (!stack.empty()){
            stack.pop();
            System.out.println(stack);
        }

    }
}
