package main.java.com.mokhov.ch8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Game {
    String name;
    String description;
    String place;
    Date startDate;

    Game(String name, String description, String place, String startDate) {
        this.name = name;
        this.description = description;
        this.place = place;
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy");
        try {
            this.startDate = format.parse(startDate);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    abstract void goIn();
    abstract void  goOut();
}
    class PersonalGame extends Game{
        PersonalGame(String name, String description, String place, String startDate){
            super(name,description,place,startDate);
        }

        @Override
        void goIn() {

        }

        @Override
        void goOut() {

        }
    }
    class TeamGame extends Game{
        TeamGame(String name, String description, String place, String startDate){
            super(name,description,place,startDate);
        }

        @Override
        void goIn() {

        }

        @Override
        void goOut() {

        }
    }

public class AbstractTest {
    public static void main(String[] args) {
        Game gamePersonal =new PersonalGame("Night hunter",
                "Ночная ловля хищной рыбы на Москве-реке",
                "Moscow",
                "January 12, 2018");
        Game gameTeam =new TeamGame("Золотая рыбка",
                "Командные соревнования по ловле хищной рыбы на Москве-реке",
                "Moscow",
                "January 12, 2018");


    }
}
