package main.java.com.mokhov.ch5;

public class ForEach2 {
    public static void main(String[] args) {
        int[] arr = {10,22,3,5,4,2,1,5,6,8};
        int count=0;
        boolean status=false;
        for (int m: arr
             ) {
            if(m==5 && status==false) {
                status=true;
            }else if(m==5 && status==true){
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
