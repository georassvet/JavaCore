package main.game1;

public class Field{
    private char[] field;

    public Field(){
        field = new char[9];
    }

    public void setField(char marker, int pos) {
        field[pos]=marker;
    }
    public void print(){
        for (int i = 0; i < 9 ; i++) {
            System.out.print(field[i]+" ");
            if(i%3==0){
                System.out.println();
            }
        }
        System.out.println();
    }

}

