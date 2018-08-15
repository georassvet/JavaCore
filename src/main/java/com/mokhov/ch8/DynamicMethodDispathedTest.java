package main.java.com.mokhov.ch8;

class X{
    void callMe(){
        System.out.println("In X");
    }
}
class Y extends X{
    void callMe(){
        System.out.println("In Y");
    }
}
class Z extends Y{
    void callMe(){
        System.out.println("In Z");
    }
}

public class DynamicMethodDispathedTest {
    public static void main(String[] args) {
        X x= new X();
        Y y =new Y();
        Z z=new Z();

        x.callMe();
        x=y;
        x.callMe();
        x=z;
        x.callMe();

    }
}
