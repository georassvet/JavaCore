package main.java.com.mokhov.ch9;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HashCode {
    public static void main(String[] args) {
//        Object object =new Object();
//        int hashCode = object.hashCode();
//        System.out.println("hashCode() " + hashCode);
//
//        object =new Object();
//        hashCode = object.hashCode();
//        System.out.println(hashCode);
//
//        System.out.println("System.identityHashCode(object) " + System.identityHashCode(object));
//        System.out.println(Integer.toHexString(100));

        Cat cat = new Cat("Маруся", 12, 8.5f);
        System.out.println("cat.hashCode()" + cat.hashCode());
        Cat cat2 = new Cat("Маруся", 12, 8.5f);
        System.out.println("cat2.hashCode()"+cat2.hashCode());
        Cat cat3 = new Cat("Котлета", 12, 8.5f);
        System.out.println("cat3.hashCode()"+cat3.hashCode());


        System.out.println(" cat.equals(cat2) "+ cat.equals(cat2));
        System.out.println(" cat.equals(cat2) "+ cat.equals(cat3));
        System.out.println(" cat.equals(cat2) "+ cat2.equals(cat));

        System.out.println("Cat.result()" + Cat.result());

    }

}
class Cat{
    BigDecimal dec;
    BigInteger bigInteger;
    String name;
    int age;
    float weight;


    public int hashCode(){
        int result = 17;
        char ch = '\u0000';
        result = 37*result+age;
        result = 37*result+Float.floatToIntBits(weight);
        result = 37*result+name.hashCode();
        return result;
    }

    public boolean equals(Object object){
        if(this==object){
            return true;
        }
        if(object==null){
            return false;
        }
        if(this.getClass()!=object.getClass()){
            return false;
        }
        Cat cat = (Cat)object;
        if(this.name.equals(cat.name)
                &&(this.weight==cat.weight)
                &&(this.age==cat.age)){
            return true;
        }
        return false;
    }


    Cat(String name, int age, float weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    static private int k;

    static int result(){
        return k+10;
    }


}


