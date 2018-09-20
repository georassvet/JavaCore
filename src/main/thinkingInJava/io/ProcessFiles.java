package main.thinkingInJava.io;

public class ProcessFiles {
    public interface Strategy{
        void process();
    }
    private Strategy strategy;
    private String ext;

    public ProcessFiles(Strategy strategy, String ext){
        this.strategy=strategy;
        this.ext=ext;
    }

    void start(){

    }

    static void processDirectoryTree(){

    }

}
