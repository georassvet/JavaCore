package main.thinkingInJava.io;

import java.io.*;

public class DataStreams {

    static final double[] prices = {10.00, 12.75, 0.33, 1.30, 8.00};
    static final String[] products = {"Meat", "Fish", "Bread", "Milk", "Fruits"};
    static  final int[] units = {1, 1, 2, 2, 5};

    public static void main(String[] args) throws IOException {

        DataInputStream dis = null;
        DataOutputStream dos = null;

        int unit;
        double price;
        String product;
        String in = "input.txt";
        String out = "output.txt";
        double total=0;
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(in)));
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(out)));

        for (int i = 0; i < prices.length ; i++) {
            dos.writeInt(units[i]);
            dos.writeDouble(prices[i]);
            dos.writeUTF(products[i]);
        }
            try {
            while (true){
                unit = dis.readInt();
                price = dis.readDouble();
                product = dis.readUTF();

                System.out.println("total "+product + ": " + unit*price);
                total+=unit*price;
            }
        }catch (EOFException ex){
            ex.getMessage();
        }
        System.out.println("Total: "+total);

    }
}
