package main.thinkingInJava.io;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class ProcessFiles {
    public interface Strategy{
        void process(File file);
    }
    private Strategy strategy;
    private String ext;

    public ProcessFiles(Strategy strategy, String ext){
        this.strategy=strategy;
        this.ext=ext;
    }

    public void start(String[] args){
        try {
            if (args.length == 0)
                processDirectoryTree(new File("."));
            else
                for (String s : args
                      ) {
                File fileDir = new File(s);
                if(fileDir.isDirectory())
                    processDirectoryTree(fileDir);
                else {
                    Pattern pattern = Pattern.compile(ext);
                    if (!pattern.matcher(s).matches())
                        s += "." + ext;
                    strategy.process(new File(s).getCanonicalFile());
                }
            }
        }catch (IOException ex){

        }
    }

    public void processDirectoryTree(File root) throws IOException {
        for (File f:Directory.walk(root.getAbsolutePath(), ext)
             ) {
            strategy.process(f.getCanonicalFile());
        }
    }

    public static void main(String[] args) {
        new ProcessFiles(new ProcessFiles.Strategy(){
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        }, "java").start(args);
    }
}
