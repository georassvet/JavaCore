package main.thinkingInJava.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AssociativeArray<K,V> {
    private Object[][] array;
    private int index;
    public AssociativeArray(int size){
        array =new Object[size][2];
    }

    V put(K key, V value){
        if(index>=array.length){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            array[index++]=new Object[]{ key, value };
            return value;
        }
    }
    V get(K key){
        for (int i = 0; i <array.length ; i++) {
            if(array[i][0].equals(key)){
                return (V)array[i][1];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder =new StringBuilder();
        for (int i = 0; i < array.length ; i++) {
            stringBuilder.append(array[i][0].toString());
            stringBuilder.append(":" + array[i][1].toString()+"\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] text = ("Дуолинго — бесплатная платформа для изучения языка " +
                "и краудсорсингововых переводов. Сервис разработан так," +
                " что по мере прохождения уроков пользователи параллельно " +
                "помогают переводить веб-сайты, статьи и другие документы." +
                "Дуолинго — бесплатная платформа для изучения языка").split(" ");
        Set<String> uniques = new TreeSet<>(Arrays.asList(text));
        AssociativeArray<String,Integer> array = new AssociativeArray<>(uniques.size());
        for (String u : uniques
             ) {
            int count = 0;
            for (String  t : text
                 ) {
                if(u.equals(t)) count++;
            }
            array.put(u,count);
        }
        System.out.println(array);
    }
}
