package ch3;

import java.util.Scanner;

public class AutoArray {
    public static void main(String[] args) {
        int[] monthdays={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] monthNames={"January", "February","March","April",
        "May","June","July","August","September","October","November",
        "December"};

        System.out.println("How many days in");
        Scanner scanner =new Scanner(System.in);
        String month=scanner.next();

        for (int i = 0; i < monthNames.length; i++) {
            if(month.equals(monthNames[i])){
                int numInArray = i;
                int daysInMonth = monthdays[i];
                System.out.println(month+" has "+daysInMonth);
            }
        }

    }
}
