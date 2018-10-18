package main.java.com.mokhov.ch15;

interface MInt2<R,T>{
    R func(T value);
}

class MyClass3<T>{
    private T val;

    public  MyClass3(T val){
        this.val=val;
    }
    public MyClass3(){
        this.val=null;
    }

    public T getVal() {
        return val;
    }
}
class SimpleClass{
    private String string;

    public SimpleClass(String string){
        this.string = string;
    }
    public SimpleClass(){
        this.string = "";
    }
    public String getString() {
        return string;
    }
}


public class ConstructorRefDemo3 {

    static <R,T> R myClassFactory(MInt2<R,T> mInt2, T v){
        return mInt2.func(v);
    }



    public static void main(String[] args) {
        MInt2<MyClass3<Double>,Double> mInt2 = MyClass3<Double>::new;
        MyClass3<Double> mc3 = myClassFactory(mInt2,99.01);
        System.out.println(mc3.getVal());

        MInt2<SimpleClass,String> sci = SimpleClass::new;

        SimpleClass sc = myClassFactory(sci,"Hello world");

        System.out.println(sc.getString());






    }
}
