package main.java.com.mokhov.ch13;

public class AssertDemo {
    static int i =3;
    static int getI(){
        return i--;
    }

    public static void main(String[] args) {
        for (int j = 0; j <10 ; j++) {
            int k =getI();
            assert k>0;
            System.out.println(k);
        }
    }

}
