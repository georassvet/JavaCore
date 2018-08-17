package main.java.com.mokhov.ch9;

interface MyInterface{
    void sayHello();
    default void sayBye(){
        System.out.println("Bye!");
    }

    static int getDefaultNumber(){
        return 0;
    }
}

interface  MyInterface2 extends MyInterface{

    default void sayBye(){
        MyInterface.super.sayBye();
    }
}

public class DefaultMethodDemo implements MyInterface2 {
    public static void main(String[] args) {
        MyInterface2 myInterface =new DefaultMethodDemo();
        myInterface.sayBye();
        myInterface.sayHello();

        MyInterface2 myInterface2 = (MyInterface2) myInterface;

        System.out.println(MyInterface.getDefaultNumber());

    }
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

//    public void sayBye(){
//        System.out.println("Good bye my friend");
//    }
}
