package main.java.com.mokhov.ch21;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.printf("%d %(d %+d %05d%n",3,-3,3,3);
        System.out.println();
        System.out.printf("Default floating point format: %f%n", 1234567.123);
        System.out.printf("Floating point format with commas: %,f%n", 1234567.123);
        System.out.printf("Negative floating-point format default: %,f%n", -1234567.123);
        System.out.printf("Negative floating-point format default: %,(f%n", -1234567.123);
        System.out.println();
        System.out.printf("Positive and negative values:%n");
        System.out.printf("% ,.2f%n% ,.2f%n",1234567.123,-1234567.123);
    }
}
