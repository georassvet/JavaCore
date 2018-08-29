package main.java.com.mokhov.ch18collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Idioms {
    public static void main(String[] args) {
        String[] cars={"BMW","VOLKSWAGEN","LADA","NIVA","MERCEDES"};
        String[] rusCars ={"LADA","NIVA","UAZ"};

        Set<String> unionCars = new HashSet<>(Arrays.asList(cars));
        unionCars.addAll(Arrays.asList(rusCars));
        System.out.println("unionCars: "+unionCars);

        Set<String> intersectCars = new HashSet<>(Arrays.asList(cars));
        intersectCars.retainAll(Arrays.asList(rusCars));
        System.out.println("intersectCars: "+intersectCars);

//        Set<String> differenceCars1 =new HashSet<>(cars);
//        differenceCars1.removeAll(rusCars);
//        System.out.println("differenceCars1: "+differenceCars1);
//
//        Set<String> differenceCars2 =new HashSet<>(rusCars);
//        differenceCars2.removeAll(cars);
//        System.out.println("differenceCars2: "+differenceCars2);

    }

}
