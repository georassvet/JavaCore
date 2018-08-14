package main.java.com.mokhov.ch7;

class Outer{

    private int a =10;

    void  createInner(){
        Inner inner =new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println(a);
        }
    }
    static  class InnerStatic{
        int b=100;
        void go(){
            System.out.println("Hello world!");
        }
    }
}




public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner();
    }
}
