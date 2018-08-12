package main.java.com.mokhov.ch5;

public class ForEach3 {
    public static void main(String[] args) {
        int sum=0;
        int[][] multiArr = new int[2][3];

        for (int i=0;i<multiArr.length; i++){
            for (int j = 0; j <multiArr[i].length ; j++) {
                multiArr[i][j]=i*j+(i+j);
            }
        }

        for (int[] x:multiArr
             ) {
            for (int  k: x
                 ) {
                sum+=k;
                System.out.print(k+ " ");
            }
            System.out.println();
        }
        System.out.println("Сумма "+sum);
    }

}
