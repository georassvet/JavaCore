package main.java.com.mokhov.ch21;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("objects.txt"))){
            User user =new User("Sergey Mokhov",28);
            System.out.println(user);

            ous.writeObject(user);

        }catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.txt"))) {
            User user = (User)ois.readObject();
            System.out.println("After serialization: "+user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class User implements Serializable{
    private String name;
    private int age;

    public User(String name, int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return name+" : "+age;
    }
}
