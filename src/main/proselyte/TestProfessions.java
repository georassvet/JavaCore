package main.proselyte;

public class TestProfessions {
    public static void main(String[] args) {
        Profession devOps =new Developer("cppDeveloper", "engineer", "oil and gas");
        Profession pilot =new Pilot("pilot", "airports");

        devOps.job();
        pilot.job();

        System.out.println(devOps);
        System.out.println(pilot);

    }
}
