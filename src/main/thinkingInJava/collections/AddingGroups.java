package main.thinkingInJava.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddingGroups {
    public static void main(String[] args) {
        ArrayList<Apple> apples1 =new ArrayList<>();
        Apple[] apples2 =new Apple[]{
                new Gala(),
                new Fuji(),
                new GrannySmith()
        };
        Collections.addAll(apples1,new GrannySmith(),new Fuji());
        Collections.addAll(apples1,apples2);
        System.out.println("apples1 "+apples1);
        System.out.println("apples2 "+apples2);

        List<Apple> apples = Arrays.asList(new GrannySmith(),new Gala(),new Fuji());
        apples.set(1,new Fuji());
      //  apples.add(new Gala());

    }
}
