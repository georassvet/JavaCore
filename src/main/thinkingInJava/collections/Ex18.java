package main.thinkingInJava.collections;

import java.util.*;

public class Ex18 {
    static  Map<String,String> dictionary = new HashMap<>();
    static {
        dictionary.put("emphasise","подчеркивать");
        dictionary.put("usage","применение");
        dictionary.put("straightforward","простой");
        dictionary.put("inadvertently","ненароком");
        dictionary.put("pull","вытащить");
        dictionary.put("suppress","подавлять");
        dictionary.put("intent","намерение");
        dictionary.put("aware","знать");
        dictionary.put("culprit","преступник");
        dictionary.put("onward","далее");
        dictionary.put("inappropriate","несоответствующий");
        dictionary.put("explanatory","пояснительная");
        dictionary.put("immensely","очень");
        dictionary.put("vowels","гласные");
        dictionary.put("complaint","жалоба");
        dictionary.put("surround","окружать");
        dictionary.put("aforementioned","вышеупомянутый");
        dictionary.put("prevented","предотвратить");
        dictionary.put("succinct","краткий");
//        dictionary.put("","");

    }

    public static void main(String[] args) {


        Set<String> set = dictionary.keySet();
        System.out.println("set: "+set);

        TreeSet<String> sordedSet = new TreeSet<>(set);
        System.out.println("sorted set: "+sordedSet);

        LinkedHashMap<String,String> linkedHashMap =new LinkedHashMap<>();
        for (String s : sordedSet){
            linkedHashMap.put(s,dictionary.get(s));
        }
        System.out.println(linkedHashMap);


    }
    static  void startTest(Set<String> set){
        Scanner sc =new Scanner(System.in);
        for (String s: set
                ) {
            System.out.println("Please translate word: "+s);
            String answer =sc.nextLine();
            String translate = dictionary.get(s);
            if(answer.equals(translate)){
                System.out.println("Верно");
            }else{
                System.out.println("Ошибка");
            }

        }
    }
}
