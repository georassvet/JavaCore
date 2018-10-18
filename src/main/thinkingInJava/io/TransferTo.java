package main.thinkingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class TransferTo {
    private static final String FILENAME = "data.txt";
    public static void main(String[] args) throws Exception{
        FileChannel in = new FileInputStream(FILENAME).getChannel(),
                out = new FileOutputStream("data2.txt").getChannel();

    in.transferTo(0,in.size(),out);
    }
}
