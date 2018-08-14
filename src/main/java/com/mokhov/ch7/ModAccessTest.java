package main.java.com.mokhov.ch7;



class ModTest{
    int intDefault;
    public int intPublic;
    private int intPrivate;

    public void printVars(){

    }
    private void printHello(){

    }
    void print(){

    }

    public void setIntPrivate(int intPrivate) {
        this.intPrivate = intPrivate;
    }

    public int getIntPrivate() {
        return intPrivate;
    }
}

public class ModAccessTest {
    public static void main(String[] args) {
        ModTest modTest =new ModTest();

        modTest.intPublic =11;
        modTest.intDefault=12;

        modTest.setIntPrivate(10);
        System.out.println("modTest.getIntPrivate() "+modTest.getIntPrivate());
    }
}
