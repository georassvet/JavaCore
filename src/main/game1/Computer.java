package main.game1;

import java.util.Random;

public class Computer implements IPlayer {
    Random random = new Random(47);
    private static int counter = 0;
    private int id;

    public Computer(){
        id=++counter;
    }
    @Override
    public int makeStep() {
        return random.nextInt(9);

    }

    @Override
    public String getPlayerName() {
        return "Computer "+id;
    }
}
