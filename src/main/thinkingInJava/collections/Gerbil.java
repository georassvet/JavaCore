package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber){
        this.gerbilNumber=gerbilNumber;
    }
    public String hop(){
        return "I am gerbil "+ gerbilNumber + " and I am hopping";
    }

    public static void main(String[] args) {
        Map<String,Gerbil> gerbils =new HashMap<>();

        gerbils.put("Gerbil Jozef",new Gerbil(2));
        gerbils.put("Gerbil Luise",new Gerbil(5));
        gerbils.put("Gerbil Fred",new Gerbil(7));
        gerbils.put("Gerbil Donald",new Gerbil(1));

        Iterator<String> iterator =gerbils.keySet().iterator();
        while(iterator.hasNext()){
            String key =iterator.next();
            Gerbil gerbil =gerbils.get(key);
            System.out.println(key+" "+gerbil.hop());
        }

    }

}
