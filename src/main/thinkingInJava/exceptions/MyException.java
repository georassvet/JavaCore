package main.thinkingInJava.exceptions;

public class MyException extends Exception {
   private String message;

   public MyException(String message){
       this.message = message;
   }
   public String display(){
       return "My Exception message is "+message;
   }
}

class TestMyException{

    static void proc()throws MyException{
        throw new MyException("My exception");
    }
    public static void main(String[] args) {
        try {
            proc();
        }catch (MyException ex){
            System.out.println(ex.display());
            System.out.println(ex);
        }
    }
}
