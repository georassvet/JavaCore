package main.java.com.mokhov.ch9;

public class AnotherClient implements Callback {

    public void callback(int num){
        System.out.println("Num is "+num +" in AnotherClient");
    }

}
