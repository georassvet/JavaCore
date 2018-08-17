package main.java.com.mokhov.ch9;

public interface StackInterface {
    void push(int t);
    int pop();

    default void printArray(int arraySize){
        for (int i = 0; i < arraySize ; i++) {
            System.out.print(pop()+" ");
        }
        System.out.println();

    }

}
