package main.java.com.mokhov.ch7;

public class VarArgs {
    static  void vaTest(int ...args){
        for (int i:args
             ) {
            System.out.println(i);
        };

    }

    public static void main(String[] args) {
        vaTest(1,10);
        vaTest();
        vaTest(3,4,6,7,9,0);

    }


}
