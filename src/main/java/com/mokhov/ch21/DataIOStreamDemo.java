package main.java.com.mokhov.ch21;

import java.io.*;

public class DataIOStreamDemo {
    static String[] skills ={"java","linux","html","sql","css"};
    static  double[] rating ={0.1, 0.0, 0.2, 0.2,0.2};
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("datastream.txt"))){
            for (int i = 0; i <skills.length ; i++) {
                dataOutputStream.writeUTF(skills[i]);
                dataOutputStream.writeDouble(rating[i]);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        try(DataInputStream dataInputStream =new DataInputStream(new FileInputStream("datastream.txt"))){
            while (dataInputStream.read()!=-1){
                System.out.println(dataInputStream.readUTF());
                System.out.println(dataInputStream.readDouble());
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
