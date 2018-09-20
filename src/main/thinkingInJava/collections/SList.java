package main.thinkingInJava.collections;

public class SList<T> {
    T[] t;
    int next;
    int index;

    T next(){
        return t[index++];
    }

    boolean hasNext(){
        if (index<t.length){
            return true;
        }else {
            return false;
        }
    }
}
