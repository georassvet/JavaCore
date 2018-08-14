package main.java.com.mokhov.ch7;

public class StactExample {
    public static void main(String[] args) {
        Stack stack =new Stack(10);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        stack.push(21);

        for (int i = 0; i < 11 ; i++) {
            System.out.println(stack.pop());
        }

    }
}
