package main.java.com.mokhov.algorithmsBook;

public class Stopwatch {

    private final long start;

    public Stopwatch(){
        start=System.currentTimeMillis();
    }

    public double elapsedTime(){
        long now =System.currentTimeMillis();
        return (now-start)/1000.0;
    }

    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        Stopwatch stopwatch =new Stopwatch();
        double sum1 = 0.0;
        for (int i = 0; i <=n ; i++) {
            sum1+=Math.sqrt(i);
        }
        double time1 =stopwatch.elapsedTime();
        System.out.println(sum1+" seconds "+time1);
        double sum2=0.0;
        Stopwatch stopwatch1 =new Stopwatch();
        for (int i = 0; i < n ; i++) {
            sum2+=Math.pow(i,0.5);
        }
        double time2 =stopwatch.elapsedTime();
        System.out.println(sum1+" seconds "+time2);
    }

}
