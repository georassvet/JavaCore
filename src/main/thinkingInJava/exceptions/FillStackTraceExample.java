package main.thinkingInJava.exceptions;

public class FillStackTraceExample {
    static void f() throws Exception{
        System.out.println("Origin exception in f()");
        throw new Exception("exception in f()");
    }
    static void g() throws Exception{
        try{
            f();
        }catch (Exception ex){
            System.out.println("Inside g() catch block");
            ex.printStackTrace(System.out);
            throw ex;
        }
    }
    static void h() throws Exception{
        try{
            f();
        }catch (Exception ex){
            System.out.println("Inside h() catch block");
            ex.printStackTrace(System.out);
            throw (Exception)ex.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            g();
        }catch (Exception ex){
            System.out.println("Main");
            ex.printStackTrace(System.out);
        }
        System.out.println("----------------------");
        try{
            h();
        }catch (Exception ex){
            System.out.println("Main");
            ex.printStackTrace(System.out);
        }
    }
}
