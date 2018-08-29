package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardExample {
    static String[] suit ={"hearts", "diamonds", "spades", "clubs"};
    static String[] rank ={"1", "2","3","4","5","6","7", "8", "9", "10", "jack", "queen", "king"};
    static List<String> deck =new ArrayList<>();
     public static void main(String[] args) {

         for (int i = 0; i < suit.length ; i++) {
             for (int j = 0; j < rank.length ; j++) {
                 deck.add(rank[j]+" of "+suit[i]);
             }
         }

         System.out.println(deck);
         Collections.shuffle(deck);
         System.out.println(deck);

         int numhands = 3;
         int cardsPerHand = 5;
         if(numhands*cardsPerHand>deck.size()){
             System.out.println("Not enough cards");
             return;
         }
         for (int i = 0; i < numhands ; i++) {
             dealHands(deck, cardsPerHand);
         }
    }
    static <E> List<E> dealHands(List<E> list, int n){
        int deckSize =list.size();
        List<E> handView = list.subList(deckSize-n, deckSize);
        System.out.println("handView" + handView);
        List<E> hands = new ArrayList<>(handView);
        System.out.println("hands" + hands);
        handView.clear();
        return handView;
    }


}
