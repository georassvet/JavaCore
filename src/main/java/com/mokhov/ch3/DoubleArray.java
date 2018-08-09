package ch3;

public class DoubleArray {
    public static void main(String[] args) {
         int[][] doubles =new int[4][5];
         int k=0;
        for (int i = 0; i < doubles.length ; i++) {
            for (int j = 0; j < doubles[i].length ; j++) {
                doubles[i][j]=k++;
            }
        }


        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length ; j++) {
                System.out.print(doubles[i][j]);
            }
            System.out.println();
        }
    }
}
