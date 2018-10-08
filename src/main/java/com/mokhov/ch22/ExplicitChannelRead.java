package main.java.com.mokhov.ch22;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path path=null;

        try{
            path=Paths.get("input.txt");
        }catch (InvalidPathException e){
            System.out.println(e.getMessage());
        }

        try(SeekableByteChannel sbc = Files.newByteChannel(path)){
            ByteBuffer byteBuffer = ByteBuffer.allocate(128);

            while ((count=sbc.read(byteBuffer))!=-1){
                byteBuffer.rewind();
                for (int i = 0; i < count ; i++) {
                    System.out.print((char) byteBuffer.get());
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
