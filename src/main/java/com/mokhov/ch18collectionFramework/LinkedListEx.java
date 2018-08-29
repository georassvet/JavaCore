package main.java.com.mokhov.ch18collectionFramework;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> myCities =new LinkedList<>();
        myCities.add("Berlin");
        myCities.add("Kaliningrad");
        myCities.add("Peterburg");
        myCities.add("Moscow");
        myCities.add("Voronez");
        myCities.add("Smolensk");
        myCities.add("Pskov");
        myCities.add("Tver");
        myCities.add("NNovgorod");
        myCities.add("Murmansk");
        myCities.add("Kirovsk");
        myCities.add("Appatity");

        myCities.add(1,"Petrozavodsk");

        System.out.println(myCities);

        myCities.remove();
        System.out.println(myCities);
        myCities.remove(1);
        System.out.println(myCities);





    }
}
