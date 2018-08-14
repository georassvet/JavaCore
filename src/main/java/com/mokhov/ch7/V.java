package main.java.com.mokhov.ch7;

public class V {
    int a, b;
    V(int a,int b){
        this.a=a;
        this.b=b;
    }
    void test(int i,int j){
        i*=2;
        j+=3;
    }
    void update(V v){
        v.a*=2;
        v.b-=10;
    }

    V incrByNum(){
        V v =new V(a-10,b-10);
        return v;
    }

}
class CallByVal{
    public static void main(String[] args) {
        int a =10, b=20;
        V v =new V(a,b);
        System.out.println("v.a "+v.a + " | v.b "+v.b);
        v.update(v);
        System.out.println("v.a "+v.a + " | v.b "+v.b);


        V newV =v.incrByNum();
        System.out.println("a "+newV.a +" b "+newV.b );
        newV=newV.incrByNum();
        System.out.println("a "+newV.a +" b "+newV.b );



        System.out.println("Before: a="+a +" b="+b);
        v.test(a,b);
        System.out.println("After: a="+a +" b="+b);
    }
}
