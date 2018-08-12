package main.java.com.mokhov.ch5;

public class BreakWithLabel {
    public static void main(String[] args) {
        boolean br=true;

        label1:
        {
            label2:
            {
                System.out.println("l2");
                label3:
                {
                    if (br) {
                        System.out.println("Start break");
                        break label2;
                        // System.out.println("End line");
                    }
                }
                System.out.println("L2 end");
            }
            System.out.println("L1 end");
        }
    }
}
