package main.java.com.mokhov.ch5;

public class Search {
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,7,8,9,5,4,6,3,1,6,8};
        int val =5;
        boolean found =false;

        for(int i : arr){
            if(i==val){
                found=true;
                break;
            }
        }
        System.out.println(found?"Found":"No found");
    }
}
