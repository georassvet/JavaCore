package main.java.com.mokhov.ch15;

import java.util.ArrayList;
import java.util.Collections;

class MyClass{
    int val;
    MyClass(int val){
        this.val = val;
    }
}

public class UseMethodRef{
   static int compareMC(MyClass v1, MyClass v2){
        return v1.val - v2.val;
    }

    public static void main(String[] args) {
        ArrayList<MyClass> list = new ArrayList<>();
        list.add(new MyClass(10));
        list.add(new MyClass(21));
        list.add(new MyClass(33));
        list.add(new MyClass(15));
        list.add(new MyClass(18));
        list.add(new MyClass(23));

        MyClass myClass = Collections.max(list, UseMethodRef::compareMC);
        System.out.println(myClass.val);
    }


}
