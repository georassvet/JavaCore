package main.thinkingInJava.concurrency;

class NotResponsiveUI{
    double d =1;
    NotResponsiveUI(){
        run();
    }
    public void run(){

        while(d>0){
            d= d+ (Math.PI + Math.E)/d;
        }
        System.out.println(d);
    }
}
class ResponsiveUI extends Thread{
    static double d =1;
    ResponsiveUI(){
           setDaemon(true);
           start();
    }
    public void run(){
        while(true){
            d= d+ (Math.PI + Math.E)/d;
        }
    }

    public static void main(String[] args) throws Exception {
        new NotResponsiveUI();

        new ResponsiveUI();
        System.in.read();
        System.out.println(d);

    }
}

public class UIDemo {
    public static void main(String[] args) {

    }
}
