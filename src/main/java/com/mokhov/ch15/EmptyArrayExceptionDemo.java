package main.java.com.mokhov.ch15;


interface DoubleNumericArrayFunction<T extends Number>{
    T func(T[] array) throws EmptyArrayExceptionDemo;
}

public class EmptyArrayExceptionDemo extends  Exception {

    public EmptyArrayExceptionDemo(){

    }
    public static void main(String[] args) {

        DoubleNumericArrayFunction<Double> doubleNumericArrayFunction = x -> {
            double avg = 0.0;
            if(x.length==0)
                throw new EmptyArrayExceptionDemo();
            for (Double d : x
                    ) {
                avg += d;
            }
            return avg / x.length;
        };
        try{
        System.out.println("avg " + doubleNumericArrayFunction.func(new Double[]{0.0, 0.5, 0.3435, 3.4, 64.23}));

    }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
