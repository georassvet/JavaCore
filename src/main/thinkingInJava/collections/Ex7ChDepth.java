package main.thinkingInJava.collections;

import java.util.*;

public class Ex7ChDepth {

    public static void main(String[] args) {
        List<String> countries = GeneratorList.getCountries();
        List<String> cities = GeneratorList.getCities();

        Iterator<String> it= countries.iterator();
        printList(it);
        it=cities.iterator();
        printList(it);

        ListIterator<String> lt = countries.listIterator();
        while (lt.hasNext()){
            lt.next();
            System.out.print(lt.nextIndex());
            //lt.add(cities.listIterator(lt.nextIndex()).next());
        }
        System.out.println();
        System.out.println(cities);
        System.out.println(countries);

        lt=cities.listIterator(cities.size());

        while (lt.hasPrevious()){
            lt.previous();
            System.out.print(lt.previousIndex());
           // lt.add(countries.listIterator(lt.previousIndex()).next());
        }
        System.out.println(cities);
        System.out.println(countries);

    }

    static void printList(Iterator<String> iterator){
        while (iterator.hasNext()){
            System.out.print (iterator.next()+" ");
        }
        System.out.println();
    }
}
