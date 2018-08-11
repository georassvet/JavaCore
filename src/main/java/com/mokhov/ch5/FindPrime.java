package main.java.com.mokhov.ch5;

public class FindPrime {
    public static void main(String[] args) {
        int iter =500000;
        boolean isPrime;
        int count=0;
        for(int i =2;i <iter; i++){
            if(myAlg(i))
                count++;
        }
        System.out.println("1. В "+iter+" найдено "+count+" простых чисел");
        count=0;
        for(int i =2;i <iter; i++){
            if(bookAlg(i))
                count++;
        }
        System.out.println("2. В "+iter+" найдено "+count+" простых чисел");
    }
    public static boolean myAlg(int i){
       boolean isPrime=true;
        for(int j =2;j<i;j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
//        if(isPrime){
//            System.out.println(i);
//        }
        return  isPrime;
    }
    public static boolean  bookAlg(int num){
        boolean isPrime=true;
        for (int i = 2; i <=num/i ; i++) {
            if(num%i==0)
                isPrime=false;
        }
//        if(isPrime){
//            System.out.println(num);
//        }
        return isPrime;
    }
}
