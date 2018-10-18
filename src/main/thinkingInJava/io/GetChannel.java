package main.thinkingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
    private static final int BSIZE = 1024;
    private static String filename = "data.txt";
    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream(filename).getChannel();
        fc.write(ByteBuffer.wrap("Some string ".getBytes()));
        fc.close();
        fc = new RandomAccessFile(filename,"rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();
        fc = new FileInputStream(filename).getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining()){
            System.out.print((char)buff.get());
        }
    }
}
