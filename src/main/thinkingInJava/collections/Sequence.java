package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.Iterator;

//interface Selector{
//    boolean end();
//    Object current();
//    void next();
//}

public class Sequence{
    private ArrayList<Object> items;
    private int next =0;
    public Sequence(){
        items =new ArrayList<>();
    }
    public void add(Object x){
            items.add(x);
    }
    private class SeqIterator implements Iterator{
        @Override
        public boolean hasNext() {
            if(next<items.size())
                return true;
            return false;
        }
        @Override
        public Object next() {
            return items.get(next++);
        }
    }
    public SeqIterator iterator(){
        return new SeqIterator();
    }
//    private class SequenceSelector implements Selector{
//        private int i =0;
//        public boolean end(){
//            return i==items.size();
//        }
//        public Object current(){
//            return items.get(i);
//        }
//        public void next(){ if(i<items.size())i++;}
//    }
//    public Selector selector(){
//        return new SequenceSelector();
//    }
    public static void main(String[] args){
        Sequence sequence =new Sequence();
        for (int i = 0; i < 10 ; i++) {
            sequence.add(Integer.toString(i));
        }
        sequence.add(10);
        sequence.add(11);
        sequence.add(12);
        sequence.add(13);
        sequence.add(14);
        sequence.add("Hello world");

//        Selector selector = sequence.selector();
//        while (!selector.end()){
//            System.out.println(selector.current()+" ");
//            selector.next();
//    }
        Iterator iterator = sequence.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}