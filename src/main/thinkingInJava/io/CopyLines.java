package main.thinkingInJava.io;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = null;
        PrintWriter    pw = null;

        try{
            bf = new BufferedReader(new FileReader("input.txt"));
            pw =new PrintWriter(new FileWriter("output.txt"));

            String line;
            while((line = bf.readLine())!= null){
                System.out.println(line);
                pw.println(line);
            }

        }finally {
            if(bf!=null)
                bf.close();
            if(pw!=null)
                pw.close();
        }
    }
}
