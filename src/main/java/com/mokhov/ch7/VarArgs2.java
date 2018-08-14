package main.java.com.mokhov.ch7;

public class VarArgs2 {
    static void vaTest(String msg, int ...v){
        System.out.println(msg+v.length+ " Contents: ");

        for(int x:v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Hello world!",4,5,6,2,5);
        vaTest("Lets play",2,5);
        vaTest("go home");
    }
}
