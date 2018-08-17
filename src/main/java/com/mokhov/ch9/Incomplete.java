package main.java.com.mokhov.ch9;

public abstract class Incomplete implements Callback {
    void test(){
        System.out.println("From incomplete class");
    }
}
class Test{
    public static void main(String[] args) {
            Callback callback =new Incomplete() {
          public void callback(int num){
              System.out.println("Hello world");
          }

        };

        Incomplete incomplete = (Incomplete)callback;

        incomplete.callback(100);
        incomplete.test();

        Callback mycall = incomplete;

        mycall.callback(10);

    }
}