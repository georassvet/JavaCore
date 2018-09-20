package main.thinkingInJava.exceptions;

public class MyTestExceptions {

    static void procA() throws IllegalAccessException{
        try {
            procB();
        }catch (IllegalAccessException ex){
            for (StackTraceElement ste : ex.getStackTrace()
                 ) {
                System.out.println("getClassName() : " + ste.getClassName());
                System.out.println("getFileName() : " + ste.getFileName());
                System.out.println("getMethodName() : " + ste.getMethodName());
                System.out.println("getLineNumber() : " + ste.getLineNumber());
                System.out.println("isNativeMethod() : " + ste.isNativeMethod());
                System.out.println("---------------");
            }
            throw ex;

        }
    }
    static void procB() throws IllegalAccessException{
        throw new IllegalAccessException("Method B");
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (IllegalAccessException ex){
            System.out.println(ex);
        }
    }
}
