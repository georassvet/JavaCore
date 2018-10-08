package main.java.com.mokhov.ch22;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelBufferedDemo {
    public static void main(String[] args) {
        try(FileChannel fileChannel = (FileChannel)Files.newByteChannel(Paths.get("input.txt"))){
            long size = fileChannel.size();
            MappedByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY,0,size);

            for (int i = 0; i <size ; i++) {
                System.out.print((char)byteBuffer.get());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
