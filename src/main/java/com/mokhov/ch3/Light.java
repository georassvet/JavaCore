package ch3;

public class Light {
    public static void main(String[] args) {
        int lightSpeedMetersPerSeconds;
        int rocketSpeedMetersPerSecond;
        long days;
        long seconds;
        long distance;
        long distanceToMoon;
        byte metersPerKilometers =100;


        lightSpeedMetersPerSeconds=	299792458;
        distanceToMoon=384400;

        days=100;
        seconds= days*24*60*60;
        distance =lightSpeedMetersPerSeconds*seconds/metersPerKilometers;

        System.out.print("In "+days);
        System.out.print(" days light will travel "+distance+" kilometers");




    }
}
