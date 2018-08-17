package main.java.com.mokhov.ch9;

public class TestInterface {
    public static void main(String[] args) {
        Callback myClient =new Client();
        Callback client2 =new AnotherClient();

        myClient.callback(100);
        client2.callback(21);

    }
}
