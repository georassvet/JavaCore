package main.thinkingInJava.collections;

public class GroundHog2 extends GroundHog {

    public GroundHog2(int i) {
        super(i);
    }

    public boolean equals(Object obj){
        return (obj instanceof GroundHog2) && (this.i ==((GroundHog)obj).i );
    }
    public int hashCode(){
        return i;
    }
}
class SpringDetector2{
    public static void main(String[] args) throws Exception {
        SpringDetector.detectSpring(GroundHog2.class);
    }
}

