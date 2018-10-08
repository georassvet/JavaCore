package main.thinkingInJava.io;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class DiskUsage {
    static final int size =1024;

    private static void print(FileStore fileStore) throws IOException {
        long total = fileStore.getTotalSpace()/size;
        long used = fileStore.getTotalSpace()- fileStore.getUnallocatedSpace()/size;
        long usable = fileStore.getUsableSpace()/size;


        System.out.format("%-20s %12d %12d %12d%n",fileStore.toString(), total, used, usable);

    }
    public static void main(String[] args) {
       FileSystem fSystem = FileSystems.getDefault();
        System.out.format("%-20s %12s %12s %12s%n","FileSystem","total","used","avail");
       try {
           for (FileStore fStore : fSystem.getFileStores()
                   ) {
               print(fStore);
           }
       }catch (IOException e){
           e.printStackTrace();
       }


    }
}
