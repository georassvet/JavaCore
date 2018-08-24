package main.proselyte;

public abstract class Profession {
   private String professionName;
   private String industry;

    public Profession(String professionName, String industry){
        this.professionName=professionName;
        this.industry=industry;
    }

    public String getProfessionName(){
        return professionName;
    }
    public void setProfessionName(String professionName){
        this.professionName=professionName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public abstract void job();

    @Override
    public String toString() {
        return "professionName " + professionName+"\n"+
                "industry " + industry + "\n";
    }
}
