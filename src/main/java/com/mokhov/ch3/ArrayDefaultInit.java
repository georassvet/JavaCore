package ch3;

public class ArrayDefaultInit {
    public static void main(String[] args) {
        int[] ints= new int[10];
        System.out.println("ints[0] "+ints[0]);

        byte[] bytes= new byte[10];
        System.out.println("bytes[0] "+bytes[0]);

        short[] shorts =new short[10];
        System.out.println("shorts[0] "+shorts[0]);

        char[] chars =new char[10];
        System.out.println("chars[0] "+chars[0]);

        boolean[] booleans =new boolean[10];
        System.out.println("booleans[0] "+booleans[0]);

        String[] strings = new String[10];
        System.out.println(strings[0]);

        float[] floats =new float[10];
        System.out.println("floats[0] "+floats[0]);
    }
}
