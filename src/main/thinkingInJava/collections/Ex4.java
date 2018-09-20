package main.thinkingInJava.collections;

import java.util.*;

class Generator {
    private String[] characters = {"Золушка", "Буратино", "Заяц и волк", "Дед мороз", "Колобок"};
    static Random random = new Random();

    public String next() {
        int len = characters.length;
        return characters[random.nextInt(len)];
    }

    public void fillArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = next();
        }
    }

    public Collection<String> fillCollection(Collection<String> collection, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(next());
        }
        return collection;
    }

}

public class Ex4 {
    public static void main(String[] args) {
        Generator generator =new Generator();

        String[] array =new String[10];
        generator.fillArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println(generator.fillCollection(new ArrayList<>(),2));
        System.out.println(generator.fillCollection(new LinkedList<>(),10));
        System.out.println(generator.fillCollection(new HashSet<>(),5));
        System.out.println(generator.fillCollection(new TreeSet<>(),8));
        System.out.println(generator.fillCollection(new LinkedHashSet<>(),0));

    }
}
