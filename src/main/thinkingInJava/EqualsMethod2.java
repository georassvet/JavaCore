package main.thinkingInJava;

class Value{
    int i;
}
public class EqualsMethod2 {
    public static void main(String[] args){
        Value value1 =new Value();
        Value value2 =new Value();
        value1.i=value2.i=100;

        System.out.println(value1.equals(value2));
    }
}
