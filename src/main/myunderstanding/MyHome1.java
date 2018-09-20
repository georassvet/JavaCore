package main.myunderstanding;

import java.util.Collections;

interface MyInterface<Integer>{
    void add(Object val);
    void remove(Object o);
    boolean searchByVal();
    Integer searchByIndex();
    Integer max();
    Integer min();
    double avg();
}
public class MyHome1 implements MyInterface{

    Integer[] array = new Integer[10];
    int pos;

    int size(){
        return array.length;
    }
    @Override
    public void add(Object val) {
        if(pos>=size()){
            resize();
        }
        array[pos++]=(Integer)val;
    }

    void resize(){
        Integer[] newArray = new Integer[size()+10];
        System.arraycopy(array,0,newArray,0,size());
        array=newArray;
    }


    @Override
    public void remove(Object o) {
        pos--;
    }

    @Override
    public boolean searchByVal() {
        return false;
    }

    @Override
    public Object searchByIndex() {
        return null;
    }

    @Override
    public Object max() {
        return null;
    }

    @Override
    public Object min() {
        return null;
    }

    @Override
    public double avg() {
        return 0;
    }
}
