package main.java.com.mokhov.ch21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String string ="abcdefghijklmnopqrstuvwxyz";
        byte[] buf = string.getBytes();
        ByteArrayInputStream byteArrayInputStream =new ByteArrayInputStream(buf);
        ByteArrayInputStream byteArrayInputStream1 =new ByteArrayInputStream(buf,0,3);

        for (int i = 0; i <2 ; i++) {
            int c;
             while ((c = byteArrayInputStream.read())!=-1){
              if(i==0){
                  System.out.print((char)c);
              }
              else{
                  System.out.print(Character.toUpperCase((char)c));
              }

          }
          byteArrayInputStream.reset();
             System.out.println();
        }

    }
}
