package main.thinkingInJava.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class UsingBuffers {
    public static void main(String[] args) {
        char[] data = "Moscow city".toCharArray();
        ByteBuffer byteBuffer = ByteBuffer.allocate(data.length*2);
        CharBuffer charBuffer = byteBuffer.asCharBuffer();
        charBuffer.put(data);
        System.out.println(charBuffer.rewind());
        symmetric(charBuffer);
        System.out.println(charBuffer.rewind());
        symmetric(charBuffer);
        System.out.println(charBuffer.rewind());
    }
    private static void symmetric(CharBuffer buffer){
        while(buffer.hasRemaining()){
            buffer.mark();
            char c1 =buffer.get();
            char c2 =buffer.get();
            buffer.reset();
            buffer.put(c2).put(c1);
        }
    }
}
