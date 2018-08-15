package main.java.com.mokhov.ch8;

class C{
    int i;
}
class D extends C{
    private int i;

    D(int i1, int i2){
        super.i=i1;
        i=i2;
    }
    void show(){
        System.out.println("super.i "+super.i);
        System.out.println("i "+i);
    }

}




public class DemoSuper2 {
    public static void main(String[] args){
        D d= new D(3,4);
        d.show();


    }
}
