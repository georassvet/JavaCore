package main.myunderstanding;

import java.util.*;

class Coin{
    int nominal;
    int year;
    Material material;

    public Coin(int nominal, int year, Material material){
        this.nominal=nominal;
        this.year =year;
        this.material =material;
    }
    enum  Material{
        gold,
        silver,
        bronze,
        metal
    }

    @Override
    public String toString() {
        return "Coin: "+nominal+" "+ material+" "+year;
    }
}

class MyCollection  implements Collection<Coin> {
    private Coin[] array;
    private int size;
   public MyCollection(int size){
       array = new Coin[size];
    }
    void checkSize(){
       if(size>=array.length) {
           Coin[] newArray = new Coin[array.length + 10];
           for (int i = 0; i < array.length; i++) {
               newArray[i] = array[i];
           }
           array = newArray;
       }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length==0;
    }

    @Override
    public boolean contains(Object o) {
        for (Coin coin:array) {
            if(coin.equals(o)){ return true; }
        }
        return false;

//       Iterator<Coin> it = iterator();
//       while (it.hasNext()){
//           if(o.equals(it.next())){
//               return true;
//           }
//       }
//        return false;
    }

    @Override
    public Iterator<Coin> iterator() {
        return new Iterator<Coin>() {
            int index;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public Coin next() {
                return array[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Coin coin) {
       checkSize();
       array[size++] = coin;
       return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals(o)){
            }
        }
       return false;
    }



    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Coin> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
    public static void main(String[] args) {
        MyCollection myCollection =new MyCollection(10);
        myCollection.add(new Coin(10,2017,Coin.Material.metal));
        myCollection.add(new Coin(5,2013,Coin.Material.metal));
        myCollection.add(new Coin(2,2012,Coin.Material.metal));
        myCollection.add(new Coin(1,2011,Coin.Material.metal));
        myCollection.add(new Coin(1,1862,Coin.Material.metal));
        myCollection.add(new Coin(10,2015,Coin.Material.metal));
        myCollection.add(new Coin(10,2015,Coin.Material.metal));
        myCollection.add(new Coin(10,2015,Coin.Material.metal));
        myCollection.add(new Coin(10,2015,Coin.Material.metal));
        myCollection.add(new Coin(10,2015,Coin.Material.metal));
        myCollection.add(new Coin(10,2015,Coin.Material.metal));

        for (Coin coin: myCollection) {
            System.out.println(coin);
        }
    }
}