package main.thinkingInJava.collections;

import java.util.*;

public class GeneratorList {
   static Map<String,String> worldCities = new HashMap<>();
   static {
        worldCities.put("Moscow","Russia");
        worldCities.put("Saint-Petersburg","Russia");
        worldCities.put("New York","USA");
        worldCities.put("Beijing","China");
        worldCities.put("New Delhi", "India");
        worldCities.put("Montreal","Canada");
        worldCities.put("Minsk","Belarus");
        worldCities.put("Berlin","Germany");
    }
    static List<String> getCountries(){
        Set<String> countries = new HashSet<>(worldCities.values());
       return new ArrayList<>(countries);
    }
    static List<String> getCities(){
        return new ArrayList<>(worldCities.keySet());
    }
}
