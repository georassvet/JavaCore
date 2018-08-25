package main.game1;

import java.util.Scanner;

public class User implements IPlayer {
    private String name;

    public User(String name){
        this.name =name;
    }

    public String getPlayerName() {
        return name;
    }

    @Override
    public int makeStep() {
        Scanner scanner =new Scanner(System.in);
        boolean checkStep =true;
        int pos;
        do{
            pos =scanner.nextInt();

        }
        while (!checkStep);
        return pos;
    }
}
