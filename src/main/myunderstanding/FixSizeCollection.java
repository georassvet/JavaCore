package main.myunderstanding;

import java.util.Random;

public class FixSizeCollection<E> {
    Object[] array;
    static final int defaultCapacity =16;
    int pos;

    public FixSizeCollection(){
        this(defaultCapacity);
    }
    public FixSizeCollection(int size){
        array=new Object[size];
    }

    void add(E obj){
        if(pos < array.length){
            array[pos++]=obj;
            System.out.println("Добавили элемент");
        }
        else{
            updateArray();
            array[pos] = obj;
        }
    }
    void updateArray(){
        System.out.println("Обновляем array");
        Object[] arr = new Object[array.length];
        for (int i = 1, j=0; i <array.length ;) {
            arr[j++]=array[i++];
        }
        array=arr;
        pos--;
    }

    @Override
    public String toString() {
        int x = pos== 16 ? 15 : pos;
        String result ="[";
        for (int i = 0; i < x; i++) {
            result+=array[x]+" ";
        }
        return result+"]";
    }

    public static void main(String[] args) {
        FixSizeCollection<Integer> fx = new FixSizeCollection<>();
        Random random =new Random(47);
        for (int i = 0; i <25 ; i++) {
            fx.add(random.nextInt(100));
            System.out.println(fx);
        }

    }
}
