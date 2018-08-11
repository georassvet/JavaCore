package main.java.com.mokhov.ch5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;

        do{
            System.out.println("Choose the choice");
            System.out.println("1 . for loop");
            System.out.println("2 . while loop");
            System.out.println("3 . do..while loop");
            System.out.println("4 . if statement");
            System.out.println("5 . switch statement");
            choice = (char)System.in.read();
        }while(choice < '1' || choice >'5');

        switch (choice){
            case '1':{
                System.out.println("for(init; cond; iteration){");
                System.out.println("body");
                System.out.println("}");
                break;
            }
            case '2':{
                System.out.println("while(condition){");
                System.out.println("body");
                System.out.println("}");
                break;
            }
            case '3':{
                System.out.println("do{");
                System.out.println("body");
                System.out.println("}while(condition);");
                break;
            }
            case '4':{
                System.out.println("if(condition()");
                System.out.println("body");
                System.out.println("}else{");
                System.out.println("body");
                System.out.println("}");
                break;
            }
            case '5':{
                System.out.println("switch(condition)");
                System.out.println("case constant:{");
                System.out.println("body");
                System.out.println("break;");
                System.out.println("}");
                break;
            }
        }
    }
}
