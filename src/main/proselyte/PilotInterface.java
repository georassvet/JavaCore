package main.proselyte;

public interface PilotInterface {
    int KM  = 139;
    int KN =10;

    void control();

    default void age(){

    }
    static  void fly(){
        System.out.println(KM +1);
    }


}
