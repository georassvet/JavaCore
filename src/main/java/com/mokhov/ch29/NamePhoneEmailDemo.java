package main.java.com.mokhov.ch29;


import java.util.ArrayList;
import java.util.List;

class NamePhoneEmail{
    private String name;
    private String email;
    private String phone;

    public NamePhoneEmail(String name, String email, String phone){
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name +" : "+phone + " : "+email ;
    }
}

class NamePhone{
    private String name;
    private String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name +" : "+phone;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof NamePhone)){
            return false;
        }
        return this.name.equals(((NamePhone) obj).name)
                && this.phone.equals(((NamePhone) obj).phone);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37*result + (this.name == null ? 0 : this.name.hashCode());
        result = 37*result + (this.phone == null ? 0 : this.name.hashCode());
        return result;
    }
}

public class NamePhoneEmailDemo {
    static List<NamePhoneEmail> getList(){
        List<NamePhoneEmail> namePhoneEmailList = new ArrayList<>();
        namePhoneEmailList.add(new NamePhoneEmail("Alexey Loy", "a.loy@gmail.com","89261761212"));
        namePhoneEmailList.add(new NamePhoneEmail("Cherkashin Andrey", "a.cherkashin@gmail.com","89251765433"));
        namePhoneEmailList.add(new NamePhoneEmail("Pavel Durov", "durov@gmail.com","89261233245"));
        namePhoneEmailList.add(new NamePhoneEmail("Pavel Durov", "durov@gmail.com","89261233245"));
    return namePhoneEmailList;
    }

    public static void main(String[] args) {
        List<NamePhone> namePhoneList =new ArrayList<>();
        namePhoneList.add(new NamePhone("Sergey Mokhov","89264200582"));
        namePhoneList.add(new NamePhone("Alexey Mokhov","89152479282"));
        namePhoneList.add(new NamePhone("Sergey Mokhov","89264200582"));
        namePhoneList.add(new NamePhone("Vladimir Mokhov","89636941675"));
        List<NamePhoneEmail> namePhoneEmailList = new ArrayList<>();
        namePhoneEmailList.add(new NamePhoneEmail("Alexey Loy", "a.loy@gmail.com","89261761212"));
        namePhoneEmailList.add(new NamePhoneEmail("Cherkashin Andrey", "a.cherkashin@gmail.com","89251765433"));
        namePhoneEmailList.add(new NamePhoneEmail("Pavel Durov", "durov@gmail.com","89261233245"));


        namePhoneEmailList.forEach(System.out::println);
        namePhoneEmailList.stream().map(a->new NamePhone(a.getName(),a.getPhone())).forEach(System.out::println);




    }
}
