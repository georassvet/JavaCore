package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress{
    private String address;

    public StringAddress(String address){
        this.address=address;
    }

    @Override
    public String toString() {
        return super.toString() + address;
    }
}
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> addresses = new ArrayList<>(Collections.nCopies(5,new StringAddress("Hello")));
        System.out.println(addresses);
        Collections.fill(addresses,new StringAddress("World"));
        System.out.println(addresses);

    }
}
