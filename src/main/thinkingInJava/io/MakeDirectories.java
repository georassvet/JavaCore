package main.thinkingInJava.io;

import java.io.File;

public class MakeDirectories {
    static int count;
    private static void usage() {
        System.err.println();
    }

    private static void fileData(File f) {
        System.out.println(
                "Absolute path: " + f.getAbsolutePath() +
                        "\n Can read: " + f.canRead() +
                        "\n Can write: " + f.canWrite() +
                        "\n getName: " + f.getName() +
                        "\n lastModified(): " + f.lastModified() +
                        "\n getParent(): " + f.getParent() +
                        "\n getPath(): " + f.getPath() +
                        "\n length: " + f.length()
        );
        if (f.isFile())
            System.out.println("It is a file");
        if (f.isDirectory())
            System.out.println("It is a directory");
        System.out.println("=============================" + count++);
    }

    private static void move(File f) {
        if (f.list() != null) {
            for (String path : f.list()
                    ) {
                File p =new File(f.getAbsoluteFile() +"\\" + path);
                if(p.isDirectory()){
                    fileData(p);
                    move(p);

                }
            }
        }
    }

    public static void main(String[] args) {
        File startDir = new File("C:\\Users");
        move(startDir);
    }
}
