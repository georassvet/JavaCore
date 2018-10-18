package main.thinkingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
    private static final int BSIZE =1024;
    private static final String FILENAME = "TestBufferToText.txt";
    public static void main (String[] args) throws Exception{

       FileChannel fc = new FileOutputStream(FILENAME).getChannel();
       fc.write(ByteBuffer.wrap("Simple string".getBytes()));
       fc.close();
        fc = new FileInputStream(FILENAME).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fc.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());

        byteBuffer.rewind();

        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoding using " + encoding + ": "
                + Charset.forName(encoding).decode(byteBuffer));
        fc =new FileOutputStream(FILENAME).getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fc.close();

        fc = new FileInputStream(FILENAME).getChannel();
        byteBuffer.clear();
        fc.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());
        fc =new FileOutputStream(FILENAME).getChannel();
        byteBuffer = ByteBuffer.allocate(24);
        byteBuffer.asCharBuffer().put("Some text");
        fc.write(byteBuffer);
        fc.close();

        fc =new FileInputStream(FILENAME).getChannel();
        byteBuffer.clear();
        fc.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());
    }
}
