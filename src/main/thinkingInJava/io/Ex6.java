package main.thinkingInJava.io;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Exercise 6: (5) Use ProcessFiles to find all the Java source-code files
 * in a particular directory subtree that have been modified after a particular date.
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String path = "C:\\";
        String date = "20-09-2018";

        search(path,date);

    }

    public static void search (String path, String stringDate) {
        File startDir = new File(path);
        SimpleDateFormat sdf =new SimpleDateFormat("dd-mm-yyyy");
        try {
            Date date = sdf.parse(stringDate);
                recursive(startDir,1531725266000l);
        }catch (ParseException ex){
            ex.printStackTrace();
        }
    }
    static void recursive (File dir , long date) {
        if(dir.listFiles()!=null)
        for (File s : dir.listFiles()
                ) {
            if (s.isDirectory()) {
                recursive(s,date);
            } else {
                Pattern pattern = Pattern.compile("\\w*.java");
                if (pattern.matcher(s.getName()).matches()) {
                    checkFile(s, date);
                }
            }
        }
    }

    static void checkFile(File f,long date) {
        if (f.lastModified() == date) {
            fileData(f);
        }
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
    }


}
