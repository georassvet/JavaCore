package main.java.com.mokhov.ch18collectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Replace {
    public static void main(String[] args) {
        List<String> cities =Arrays.asList("Moscow","New York","Berlin", "Beijing", "Shanghai", "Helsinki");
        System.out.println(cities);
        replace1(cities,"Moscow","Moscow capital");
        System.out.println(cities);
    }
    public static <E> void replace1(List<E> list, E val, E newVal){
        for (ListIterator lt = list.listIterator(); lt.hasNext();) {
            if(val==null ? lt.next()==null : val.equals(lt.next())){
                lt.set(newVal);
            }
        }
    }
    public static <E> void replace2(List<E> list,E val, List<? extends E> newVals){
        for (ListIterator it = list.listIterator(); it.hasNext() ;) {
            if(val==null ? it.next()==null : val.equals(it.next()) ){
                it.remove();
                for ( E v : newVals
                     ) {
                    it.add(v);
                }
            }
        }
    }
}
