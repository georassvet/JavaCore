package main.thinkingInJava.io;


import java.io.Console;
import java.util.Arrays;

public class Password {
    public static void main(String[] args) {
        Console console = System.console();
        if(console==null){
            System.out.println("Console not found");
            System.exit(1);
        }
        System.out.println("Please, enter old password");
        char[] oldPassword = console.readPassword();
        if(checkPassword(oldPassword)){
            System.out.println("Old password true");
            boolean noMatch;

            do {
                char[] pass1 = console.readPassword("Please enter new password");
                char[] pass2 = console.readPassword("Please enter new password again");
                System.out.println("pass1: " + pass1);
                System.out.println("pass2: " + pass2);
                noMatch =Arrays.equals(pass1, pass2);
                if(!noMatch)
                    System.out.println("Try again");
                else
                    updatePassord();
            }
            while (!noMatch);
        }
    }
    static void updatePassord(){
        System.out.println("update password");
    }

    static boolean checkPassword(char[] oldPassword){
        char[] array = {'M','o','s','c','o','w'};
        return Arrays.equals(array,oldPassword);
    }
}
