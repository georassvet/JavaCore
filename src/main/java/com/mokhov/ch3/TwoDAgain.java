package ch3;

public class TwoDAgain {
    public static void main(String[] args) {
        int twoD[][] =new int [4][];
        twoD[0] = new int[5];
        twoD[1] = new int[10];
        twoD[2] = new int[2];
        twoD[3] = new int[8];

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j <twoD[i].length ; j++) {
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }

    }
}
