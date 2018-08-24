package main.proselyte;

public class Developer extends Profession {

    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public  Developer(String speciality, String professionName, String industry){
        super(professionName,industry);
        this.speciality =speciality;
    }

    @Override
    public void job() {
        System.out.println("Developer writes code");
    }

    @Override
    public String toString() {
        return "Hello, I am a developer, my profession " + getProfessionName()
                +", and I work in " + getIndustry()
                +". My speciality is " + getSpeciality();
    }

}
