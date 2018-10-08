package main.java.com.mokhov.ch21;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String str = "if(a == 4) a = 0;";
        ByteArrayInputStream byteArrayInputStream =new ByteArrayInputStream(str.getBytes());
        int c;
        try(PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream)){
            while ((c=pushbackInputStream.read())!=-1){
              switch ((char)c){
                  case '=':{
                      if((c=(char)pushbackInputStream.read())=='='){
                          System.out.print("eq");

                      }
                      else {
                          System.out.print("<-");
                          pushbackInputStream.unread(c);
                      }
                      break;
                  }
                  default:{
                      System.out.print((char)c);
                      break;
                  }
              }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }








    }



}
