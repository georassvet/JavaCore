package main.java.com.mokhov.ch29;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethodDemo {
    public static void main(String[] args) {
        List<NamePhoneEmail> list = NamePhoneEmailDemo.getList();

        List<NamePhone> namePhoneList = list.stream().map(a->new NamePhone(a.getName(),a.getPhone())).collect(Collectors.toList());

        namePhoneList.forEach(System.out::println);
        System.out.println();

        Set<NamePhone> namePhoneSet = list.stream().map(a->new NamePhone(a.getName(),a.getPhone())).collect(Collectors.toSet());
        namePhoneSet.forEach(System.out::println);




    }
}
