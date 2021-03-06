package main.thinkingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
    private static final String FILENAME = "data.txt";
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        FileChannel in = new FileInputStream(FILENAME).getChannel(),
                out = new FileOutputStream(FILENAME).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while (in.read(buffer) != -1){
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }



    }
}
