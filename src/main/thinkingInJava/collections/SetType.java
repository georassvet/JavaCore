package main.thinkingInJava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetType {
    protected int i;

    public SetType(int n){
        this.i=n;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SetType && ((SetType)obj).i== this.i ;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
class HashType extends SetType{
    public HashType(int i){
        super(i);
    }
    @Override
    public int hashCode() {
        return i;
    }
}
class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int i){
        super(i);
    }
    @Override
    public int compareTo(TreeType o) {
        return this.i < o.i ? -1 : ((this.i==o.i)? 0 : +1);
    }
}
class TypesForSet{
    public static <T> Set<T> fill(Set<T> set, Class<T> tClass){
        try{
            for (int i = 0; i <10 ; i++) {
                set.add(tClass.getConstructor(int.class).newInstance(i));
            }
        }catch (Exception e){throw new RuntimeException(e);}
        return set;
    }
    public static <T> void test(Set<T> set, Class<T> tClass){
        fill(set,tClass);
        fill(set,tClass);
        fill(set,tClass);
        System.out.println(set);
    }
    public static void main(String[] args) {
        test(new HashSet<HashType>(),HashType.class);
        test(new LinkedHashSet<HashType>(),HashType.class);
        test(new TreeSet<TreeType>(),TreeType.class);

        test(new HashSet<TreeType>(),TreeType.class);
        test(new LinkedHashSet<TreeType>(),TreeType.class);
        test(new HashSet<SetType>(),SetType.class);
        test(new LinkedHashSet<SetType>(),SetType.class);
        try {
            test(new TreeSet<SetType>(), SetType.class);
        }catch (Exception e) { System.out.println(e.getMessage()); }
        try {
            test(new TreeSet<HashType>(),HashType.class);
        }catch (Exception e) { System.out.println(e.getMessage()); }

    }
}
