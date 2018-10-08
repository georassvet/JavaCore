package main.java.com.mokhov.ch22;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class MappedChanelWrite {
    public static void main(String[] args) {
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("channelOut.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE)){
         MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE,0,26);
            for (int i = 0; i < 26 ; i++) {
                mappedByteBuffer.put((byte)('A'+i));
            }
            mappedByteBuffer.rewind();
            for (int i = 0; i < 26 ; i++) {
                mappedByteBuffer.put((byte)('a'+1));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
