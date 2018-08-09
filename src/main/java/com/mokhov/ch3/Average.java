package ch3;

public class Average {
    public static void main(String[] args) {
        double[] doubles ={0.6,2.3,5.2,1.5,8.2,3.2,3.4};
        System.out.println("avg " + avgArray(doubles));
    }
    static double avgArray(double[] arr){
        double result=0;
        for (int i = 0; i <arr.length ; i++) {
            result+=arr[i];
        }
        return result/arr.length;
    }

}
