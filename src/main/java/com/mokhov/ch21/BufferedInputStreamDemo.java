package main.java.com.mokhov.ch21;

import java.io.ByteArrayInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String string = "<a href=\"/article/28\" class=\"footer-link\">&copy; 2018 company group &;HeadHunter &copytryigft </a>";
        ByteArrayInputStream byteStream = new ByteArrayInputStream(string.getBytes());
        int c;
        String inner="";
        boolean marked =false;
        while((c=byteStream.read())!=-1){

            switch (c){
                case '&':{
                    if (!marked){
                        marked=true;
                        byteStream.mark(32);
                    }else {
                        marked=false;
                    }
                    break;
                }
                case ';':{
                    if(marked ){ //&& inner.equals("copy")){
                        System.out.print('©');
                        marked=false;
                    }
                    else{
                        System.out.print((char)c);
                    }
                    break;
                }
                case ' ':{
                    if(marked){
                        marked=false;
                        System.out.print("&");
                        byteStream.reset();
                    }else  {
                        System.out.print((char)c);
                    }

                    break;
                }
                default:{
                    if(!marked){
                        System.out.print((char)c);
                    }
                }
            }

        }
        //©

    }
}
