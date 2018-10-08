package main.java.com.mokhov.ch13;

class A{
    int i,j;
}
class B{
    int i,j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        A ob = c;
        System.out.println("ob reference to c");
        if(ob instanceof C)
            System.out.println("ob instanceof C");
        ob=d;
        System.out.println("ob reference to d");
        if(ob instanceof C){
            System.out.println("ob instanceof C");
        }
        if(ob instanceof A){
            System.out.println("ob instanceof A may be cast to A");
        }
        if(a instanceof Object){
            System.out.println("a instanceof Object");
        }
        if(b instanceof Object){
            System.out.println("b instanceof Object");
        }
    }
}
