package main.java.com.mokhov.ch15;


interface MyFuncFace<T>{
    boolean func(T v1, T v2);
}

public class HighTemp {
    private int hTemp;

    HighTemp(int ht){
        hTemp = ht;
    }
    boolean sameTemp(HighTemp ht2){
        return this.hTemp == ht2.hTemp;
    }
    boolean lessThanTemp(HighTemp ht2){
        return ht2.hTemp < this.hTemp;
    }
}

class InstanceMethWithObjetRefDemo{
    static <T> int counter(T[] vals, MyFuncFace<T> f, T v){
        int count = 0;

        for (int i = 0; i < vals.length ; i++) {
            if(f.func(vals[i],v)){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
      int count;
        HighTemp[] weekDays = {
          new HighTemp(89),
          new HighTemp(90),
          new HighTemp(88),
          new HighTemp(84),
          new HighTemp(85),
          new HighTemp(82),
          new HighTemp(91)
        };
        count = counter(weekDays, HighTemp::lessThanTemp, new HighTemp(87) );
        System.out.println(count);

        HighTemp[] weekDays2 = {
                new HighTemp(13),
                new HighTemp(2),
                new HighTemp(8),
                new HighTemp(0),
                new HighTemp(5),
                new HighTemp(10),
                new HighTemp(-3)
        };
        count = counter(weekDays2, HighTemp::sameTemp,new HighTemp(0));
        System.out.println(count);

    }
}
