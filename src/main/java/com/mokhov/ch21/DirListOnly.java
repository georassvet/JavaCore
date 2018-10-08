package main.java.com.mokhov.ch21;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirListOnly {
    public static void main(String[] args) {
       File[] files = local(".",".git");

        for (File f: files
             ) {
            System.out.println(f.getName());
        }
    }
    static File[] local(File dir, String regex){
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    static File[] local(String dir, String regex){
        return local(new File(dir),regex);
    }

}
