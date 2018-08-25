package main.game1;

interface GameStatus{
    int CONTINUE = 0;
    int WIN = 1;
    int DRAW = -1;
}

public class GameLogic implements GameStatus {
    private Field field =new Field();
    int counter=0;

    void gameFlow(IPlayer player1, IPlayer player2){
        System.out.println(player1.getPlayerName() +" vs "+player2.getPlayerName());

        boolean gameFlow=true;
        int gameStatus;

        for (int i = 0; i < 9 ; i++) {
            if(i%2==0){
                System.out.println("Ходит " + player1.getPlayerName());
                gameStatus = gameStep(player1, 'X');
            }else{
                System.out.println("Ходит " + player2.getPlayerName());
               gameStatus = gameStep(player2,'O');
            }
            if((i==8)&&(gameStatus==CONTINUE)){
                gameStatus=DRAW;
            }
            switch (gameStatus){
                case DRAW:{
                    System.out.println("Ничья");
                    gameFlow=false;
                    break;
                }
                case WIN:{
                    System.out.println("Вы выиграли");
                    gameFlow=false;
                    break;
                }
                case CONTINUE:{
                    break;
                }
            }
            field.print();
            if(!gameFlow){
                break;
            }
        }
    }
    private int gameStep(IPlayer player , char marker){
        int pos;
        boolean checkStep;
        do{
            pos = player.makeStep();
            checkStep = field.setField(marker,pos);
        }
        while (!checkStep);
        if(++counter>4) {
            if (checkWinner(pos)) return WIN;
        }
        return CONTINUE;
    }
    // проверяет выигрышную комбинацию, проверку ПРОВОДИТЬ ПОСЛЕ ТРЕХ ХОДОВ.
   private boolean  checkWinner(int lastPos){
        switch (lastPos){
            case 0: {
                if((field.getField(0)==field.getField(1)&&field.getField(0)==field.getField(2)) ||
                  (field.getField(0)==field.getField(4)&&field.getField(0)==field.getField(8)) ||
                (field.getField(0)==field.getField(1)&&field.getField(0)==field.getField(2))){
                    return true;
                }
                else return false;
            }
            case 1:{
                if((field.getField(1)==field.getField(0)&&field.getField(1)==field.getField(2)) ||
                        (field.getField(1)==field.getField(4)&&field.getField(1)==field.getField(7))){
                    return true;
                }
                else return false;
            }
            case 2:{
                if((field.getField(2)==field.getField(1)&&field.getField(2)==field.getField(0)) ||
                        (field.getField(2)==field.getField(4)&&field.getField(2)==field.getField(6)) ||
                        (field.getField(2)==field.getField(5)&&field.getField(2)==field.getField(8))){
                    return true;
                }
                else return false;
            }
            case 3:{
                if((field.getField(3)==field.getField(0)&&field.getField(3)==field.getField(6)) ||
                        (field.getField(3)==field.getField(4)&&field.getField(3)==field.getField(5))){
                    return true;
                }
                else return false;
            }
            case 4:{
                if((field.getField(4)==field.getField(0)&&field.getField(0)==field.getField(8)) ||
                        (field.getField(4)==field.getField(2)&&field.getField(4)==field.getField(6)) ||
                        (field.getField(4)==field.getField(1)&&field.getField(4)==field.getField(7)) ||
                        ((field.getField(4)==field.getField(3)&&field.getField(4)==field.getField(5)))){
                    return true;
                }
                else return false;
            }
            case 5:{
                if((field.getField(5)==field.getField(2)&&field.getField(5)==field.getField(8)) ||
                        (field.getField(5)==field.getField(4)&&field.getField(5)==field.getField(3))){
                    return true;
                }
                else {
                    return false;
                }
            }
            case 6:{
                if((field.getField(6)==field.getField(3)&&field.getField(6)==field.getField(0)) ||
                        (field.getField(6)==field.getField(4)&&field.getField(6)==field.getField(2)) ||
                        (field.getField(6)==field.getField(7)&&field.getField(6)==field.getField(8))){
                    return true;
                }
                else return false;
            }
            case 7:{
                if((field.getField(7)==field.getField(6)&&field.getField(7)==field.getField(8)) ||
                        (field.getField(7)==field.getField(4)&&field.getField(7)==field.getField(1))){
                    return true;
                }
                else return false;
            }
            case 8:{
                if((field.getField(8)==field.getField(4)&&field.getField(8)==field.getField(0)) ||
                        (field.getField(8)==field.getField(5)&&field.getField(8)==field.getField(2)) ||
                        (field.getField(8)==field.getField(7)&&field.getField(8)==field.getField(6))){
                    return true;
                }
                else return false;
            }
        }
        return  false;
    }

}

