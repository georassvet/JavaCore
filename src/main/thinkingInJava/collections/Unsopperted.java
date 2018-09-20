package main.thinkingInJava.collections;

import java.util.*;

public class Unsopperted {
    public static void test(String message, List<String> list){
        System.out.println("-----"+message+"-----");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
        Collection<String> c2 = new ArrayList<>(subList);

        try{
            c.retainAll(c2);
        }catch (Exception e){System.out.println("c.retainAll(c2) "+e);}
        try{
            c.removeAll(c2);
        }catch (Exception e){System.out.println("c.retainAll(c2) "+e);}
        try{
            c.clear();
        }catch (Exception e){ System.out.println("c.clear() "+e); }
        try{
            c.add("X");
        }catch (Exception e){ System.out.println("c.add() "+e); }
        try{
            c.addAll(c2);
        }catch (Exception e){ System.out.println("c.addAll() "+e); }
        try{
            c.remove("C");
        }catch (Exception e){ System.out.println("c.remove() "+e); }
        try{
            list.set(0,"C");
        }catch (Exception e){ System.out.println("list.set() "+e); }
        try{
            list.add(0,"C");
        }catch (Exception e){ System.out.println("list.add() "+e); }
        try{
            list.remove(0);
        }catch (Exception e){ System.out.println("list.remove() "+e); }

    }

    public static void main(String[] args) {
        List<String> list =Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<>(list));
        test("Arrays as List",list);
        test("UnmodifiableList",Collections.unmodifiableList(new ArrayList<>(list)));
    }
}
