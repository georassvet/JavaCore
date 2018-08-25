package main.game1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        boolean alive = true;

        while (alive){
            System.out.println(" O X O ");
            System.out.println(" X O X ");
            System.out.println(" O X X ");
            System.out.println();
            System.out.println("С кем будете играть?");
            System.out.println("0. Не хочу играть  1. C партнером  2. С рандомным интеллектом 3. Битва рандомов");
           try {
               Scanner scanner = new Scanner(System.in);
               int selectedValue = scanner.nextInt();
               GameLogic gameLogic = new GameLogic();
               switch (selectedValue) {
                   case 0: {
                       alive = false;
                       break;
                   }
                   case 1: {
                       IPlayer user1 = new User("Игрок 1");
                       IPlayer user2 = new User("Игрок 2");
                       gameLogic.gameFlow(user1, user2);
                       break;
                   }
                   case 2: {
                       IPlayer user = new User("Игрок 1");
                       IPlayer comp = new Computer();
                       gameLogic.gameFlow(user, comp);
                       break;
                   }
                   case 3: {
                       IPlayer comp1 = new Computer();
                       IPlayer comp2 = new Computer();
                       gameLogic.gameFlow(comp1, comp2);
                       break;
                   }
               }
           }catch (InputMismatchException ex){
               System.out.println("Неверное значение меню!");
           }
        }
    }
}



