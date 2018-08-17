package main.java.com.mokhov.ch9;

public class Client implements Callback {
    public void callback(int num){
        System.out.println("Num is " + num + " in Client");
    }

    public void nonInterfaceMeth(){
        System.out.println("Non interface method");
    }
}
