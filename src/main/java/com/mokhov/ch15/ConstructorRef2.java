package main.java.com.mokhov.ch15;

interface MIC<T>{
    MC func(T value);
}
class MC<T>{
    private T value;

    public MC(T value){
        this.value =value;
    }
    public MC(){
        this.value=null;
    }
    public T getValue() {
        return value;
    }
}




public class ConstructorRef2 {
    public static void main(String[] args) {
     MIC<Integer> mic  = MC<Integer>::new;
     MC<Integer> mc = mic.func(100);
        System.out.println(mc.getValue());
    }
}
