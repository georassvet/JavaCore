package ch3;
public class Matrix {
    public static void main(String[] args) {
        int m[][][] ={
                {{0*0},{0*1},{0*2}},
                {{1*0},{1*1},{1*2}}
        };
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j <m[i].length ; j++) {
                for (int k = 0; k <m[i][j].length ; k++) {
                    System.out.print(m[i][j][k]);
                }
            }
            System.out.println();
        }
    }
}
