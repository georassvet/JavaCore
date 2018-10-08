package main.java.com.mokhov.ch22;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class ExplicitChannelWriteDemo {
    public static void main(String[] args) {
        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("channel.txt"),
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE)) {
            ByteBuffer byteBuffer =ByteBuffer.allocate(30);

            for (int i = 0; i < 30  ; i++) {
                byteBuffer.put((byte)('A'+i));
            }
            byteBuffer.rewind();
            fileChannel.write(byteBuffer);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
