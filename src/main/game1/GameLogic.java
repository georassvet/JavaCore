package main.game1;


import java.util.Scanner;

public class GameLogic {
    private Field field =new Field();
    int counter=0;

    void startGame(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9 ; i++) {
            if(i%2==0){
                System.out.println("Player 1");
                int pos = sc.nextInt();
                gameStep(pos,'X');
            }else{
                System.out.println("Player 2");
                int pos = sc.nextInt();
                gameStep(pos, 'Y');
            }
            field.print();
        }
    }

    void gameStep(int pos, char player){
        System.out.println("GameStep");
        field.setField(player,pos);
    }
    boolean  checkWinner(){
        if(counter==9){
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

}

