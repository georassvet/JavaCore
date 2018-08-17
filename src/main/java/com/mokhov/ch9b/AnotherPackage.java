package main.java.com.mokhov.ch9b;

import main.java.com.mokhov.ch9.Protection;

public class AnotherPackage {
    AnotherPackage(){
        Protection protection =new Protection();
        System.out.println("protection.nPublic "+protection.nPublic);
    }
}
