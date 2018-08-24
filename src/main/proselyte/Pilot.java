package main.proselyte;

public class Pilot extends Profession {

    public Pilot(String professionName, String industry){
        super(professionName, industry);
    }
    public void job(){
        System.out.println("Pilot starts fly");
    }

//    @Override
//    public String toString() {
//        return "Hello, I  am "+getProfessionName()
//                +" and I work in "+getIndustry();
//    }
}
