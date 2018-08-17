package main.java.com.mokhov.ch9;

public class OutsideClass {
   public interface NestedInTerface{
        boolean check(int num);
    }
}
class DoubleClass implements OutsideClass.NestedInTerface{

    @Override
    public boolean check(int num) {
       return num <= 10 ? false : true;
    }
}

class TestNestedInterface{
    public static void main(String[] args) {
        OutsideClass.NestedInTerface test = new DoubleClass();
        if(test.check(100)){
            System.out.println("bigger than 10");
        }else{
            System.out.println("smaller than 10");
        }
    }
}
