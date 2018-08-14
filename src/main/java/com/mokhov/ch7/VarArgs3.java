package main.java.com.mokhov.ch7;

public class VarArgs3 {

    static void varTest(int ...args){
        System.out.println("args.length - "+args.length);
        for (int i:args
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void varTest(boolean ...args){
        for (boolean i:args
                ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void varTest(String s,boolean ...args){
        for (boolean i:args
                ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(s);
    }

    public static void main(String[] args) {
        varTest("Hello world", true, true, false);
        varTest(1,2,3);
        varTest(true);
    }
}
