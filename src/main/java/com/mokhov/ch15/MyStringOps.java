package main.java.com.mokhov.ch15;

interface StringFunc{
    String func(String n);
}
public class MyStringOps {
    static String strReverse(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    String change(String s){
        String result = "";
        for (int i = s.length()-1; i >= 0; i--) {
            result+=s.charAt(i);
        }
        return result;
    }

}
class MethodRefDemo{
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String myString = "Мы учим английский два раза в неделю";
        String outString;

        outString = stringOp(MyStringOps::strReverse,myString);

        System.out.println(outString);
        outString = stringOp(new MyStringOps()::change,outString);
        System.out.println(outString);

    }
}
