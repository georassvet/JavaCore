package main.thinkingInJava.collections;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GroundHog {
    protected int i;
    public GroundHog(int i){
        this.i=i;
    }
    @Override
    public String toString() {
        return "GroundHog #"+i;
    }
}
class Prediction{
    static Random random =new Random(47);
    private boolean shadow = random.nextDouble() > 0.5;

    @Override
    public String toString() {
        if(shadow){
            return "Six or more weeks winter";
        }
        else{
            return "Early spring";
        }
    }
}
class SpringDetector{
    public static <T extends GroundHog> void detectSpring(Class<T> type) throws Exception{
        Constructor<T> constructor = type.getConstructor(int.class);
        Map<GroundHog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10 ; i++) {
            map.put(constructor.newInstance(i), new Prediction());
        }
        System.out.println(map);
        GroundHog ghog = constructor.newInstance(3);
        System.out.println(map);
        if(map.containsKey(ghog)){
            System.out.println(map.get(ghog));
        }else{
            System.out.println("Key "+ghog+" not found");
        }
    }

    public static void main(String[] args) throws  Exception {
        detectSpring(GroundHog.class);
    }
}
