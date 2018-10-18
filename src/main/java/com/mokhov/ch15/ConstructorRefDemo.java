package main.java.com.mokhov.ch15;

interface MyFuncCon{
    MyClass2 func(int n);
}
class MyClass2{
    private int val;

    public MyClass2(int val){
        this.val = val;
    }
    public MyClass2(){
        this.val=0;
    }

    public int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {

        MyFuncCon myClass2 = MyClass2::new;

        MyClass2 c2 = myClass2.func(100);

        System.out.println(c2.getVal());
    }
}
