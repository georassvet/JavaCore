package main.java.com.mokhov.ch15;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial =
                (n)->{
            int result =1;
                    for (int i = 1; i <=n ; i++) {
                        result*=i;
                    }
                    return result;
                };
        System.out.println(factorial.apply(3));
        System.out.println(factorial.apply(4));
        System.out.println(factorial.apply(5));
        System.out.println(factorial.apply(6));



    }
}
