package main.proselyte;

public class TestClone {
    static class Person implements Cloneable{
        private String name;
        private String profession;

        Person(String name, String profession){
            this.name=name;
            this.profession=profession;
        }

        public String toString(){
            return "name: "+name
                    +"\n profession: "+profession;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    static class Car{
        String model;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person =new Person("Sergey Mokhov", "engineer");
        Person clone = (Person) person.clone();

        System.out.println(person);
        System.out.println(clone);

        clone.name="Alexey";

        System.out.println(person);
        System.out.println(clone);


    }
}
