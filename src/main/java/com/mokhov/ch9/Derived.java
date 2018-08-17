package main.java.com.mokhov.ch9;

public class Derived extends Protection {

    Derived(){
        System.out.println("nDefault "+nDefault);
        System.out.println("nPublic "+nPublic);
        System.out.println("nProtected "+nProtected);
    }
}
