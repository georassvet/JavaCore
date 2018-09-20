package main.thinkingInJava.collections;

import java.util.*;

public class Lists {
    private static boolean b;
    private static String s;
    private static  int i;
    private static Iterator<String> it;
    private static ListIterator<String> lt;

    static void testBasic(List<String> a){
        a.add("1");
        a.add(0,"2");
        a.addAll(Arrays.asList("3","4","5"));
        Collections.addAll(a,"6","7");
        b=a.containsAll(Arrays.asList("4","5"));
        System.out.println(a);
        System.out.println("b=a.containsAll(Arrays.asList());"+b);
        s =a.get(1);
        i=a.indexOf("1");
        it=a.iterator();
        lt=a.listIterator();
        lt=a.listIterator(2);
        a.set(1,"D");
        a.remove(0);
        a.remove("1");
        a.lastIndexOf("2");
        a.clear();
    }
    public static  void iterMotion(List<String> a){
        ListIterator<String> it = a.listIterator();
        b=it.hasNext();
        b=it.hasPrevious();
        s=it.next();
        s=it.previous();
        i=it.previousIndex();
        i=it.nextIndex();
    }
    public static void iterManipulation(List<String> a){
        ListIterator<String> lt =a.listIterator();
        lt.add("A");
        lt.next();
        lt.remove();
        lt.next();
        lt.set("B");
    }
    public static void testVisual(List<String> a){
        ListIterator<String> lt =a.listIterator(a.size());
        while (lt.hasPrevious()){
            System.out.println(lt.previous());
        }
    }
    public static void linkedListTest(List<String> a){
        LinkedList<String> ll = new LinkedList<>(a);
        System.out.println(ll);
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);


    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Soccer","Tennis", "Football","Swimming");

        testBasic(new ArrayList<>(strings));
        testVisual(strings);
        linkedListTest(strings);
        iterManipulation(strings);
        iterMotion(strings);
    }

}
