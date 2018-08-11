package main.java.com.mokhov.ch5;

public class IfElse {
    public static void main(String[] args){
        int month =4 ;
        String season;

        if(month==12 || month==1 || month==2){
            season ="Cold winter";
        }else if(month==3 || month==4 || month==5){
            season ="Sunny spring";
        }else if(month==6 || month==7 || month==8){
            season ="Hot summer";
        }else if(month==9 || month==10 || month==11){
            season="Colours autumn";
        }else {
            season="Bogus Month";
        }
        System.out.println(season);

    }
}
