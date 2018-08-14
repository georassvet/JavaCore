package main.java.com.mokhov.ch7;


class Test{
    int i;
    int j;

   Test(int i, int j){
       this.i=i;
       this.j=j;
    }

    int getSquare(){
       return  i*j;
    }

    boolean equalTo(Test o){
       if((o.i ==this.i)&&(o.j==this.j)){
           return true;
       }
       else {
           return false;
       }
    }
}

public class TestPass {
    public static void main(String[] args) {
        Test t1 = new Test(10,5);
        Test t2 = new Test(5,10);
        Test t3 = new Test(5,10);

        if(t1.equalTo(t2)){
            System.out.println("Objects equals");
        }else{
            System.out.println("Objects not equals");
        }
        if(t3.equalTo(t2)){
            System.out.println("Objects equals");
        }else{
            System.out.println("Objects not equals");
        }
    }
}
