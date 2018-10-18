package main.java.com.mokhov.ch15;

interface FuncInt<T>{
    int func(T[] v1 , T v2);
}

public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if(vals[i] == v ){
                count++;
            }
        }
        return count;
    }
}

class GenericMethodRefDemo{
    static <T> int myOp(FuncInt<T> f, T[] vals, T v){
        return  f.func(vals, v);
    }

    public static void main(String[] args) {
        int count;
        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String[] strs = {"one","two","three","two"};

        count = myOp(MyArrayOps::countMatching,vals,4);
        System.out.println(count);
        count = myOp(MyArrayOps::countMatching,strs,"two");
        System.out.println(count);
    }


}

