package main.java.com.mokhov.ch7;

public class VarArgs4 {

    static void varTest(int ...a){
        System.out.println(a.length);
    }
    static void varTest(boolean...b){
        System.out.println(b.length);
    }

    public static void main(String[] args) {
        varTest(123,432,345,654);
        varTest(true,false);
        //varTest();
    }
}
