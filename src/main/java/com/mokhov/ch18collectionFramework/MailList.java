package main.java.com.mokhov.ch18collectionFramework;

import java.util.ArrayList;

class Address{
    private String city;
    private int postalCode;
    private String street;
    private String name;
    private String phone;

    public Address(String city, int postalCode, String name, String street, String phone){
        this.city=city;
        this.postalCode=postalCode;
        this.name=name;
        this.phone=phone;
        this.street=street;
    }
    @Override
    public String toString(){
        return "Postal code: "+postalCode + " City: "+city
                +"\nStreet: "+street
                +"\nName: "+name+ " Phone: "+phone;
    }

}



public class MailList {
    public static void main(String[] args) {
        ArrayList<Address> mails = new ArrayList<>();
        mails.add(new Address("Moscow",127543, "Sergey Mokhov", "Korneychuka, 38a, 211", "8(926)420-05-82"));
        mails.add(new Address("Beijing",543216837, "Shou Shiju", "xiao confu yabolow, 3", "+13(1234)220-11-36"));

        for (Address address : mails
             ) {
            System.out.println(address);
            System.out.println();
        }

    }
}
