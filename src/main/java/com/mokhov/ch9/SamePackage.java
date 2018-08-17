package main.java.com.mokhov.ch9;

public class SamePackage {
    SamePackage(){
        Protection protection = new Protection();
        System.out.println("protection.nDefault"+protection.nDefault);
        System.out.println("protection.nProtected"+protection.nProtected);
        System.out.println("protection.nPublic"+protection.nPublic);
    }
}
