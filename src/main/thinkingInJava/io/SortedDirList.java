/**
 Create a class called SortedDirList with a constructor that takes a File object
 and builds a sorted directory list from the files at that File.
 Add to this class two overloaded list( ) methods: the first produces the whole list,
 and the second produces the subset of the list that matches its argument (which is a regular expression).
 */
package main.thinkingInJava.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
    private String[] list;
    public SortedDirList(File path){
        list=path.list();
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
    }
    public String[] list(){
        return list;
    }
    public String[] list(String regex){
        Pattern pattern =Pattern.compile(regex);
        ArrayList<String> arrayList =new ArrayList<>();
        for (String s :list
             ) {
            if(pattern.matcher(s).matches()){
                arrayList.add(s);
            }
        }
        String[] result={};
        return arrayList.toArray(result);
    }
    public static void display(String[] array){
        for (String s: array
             ) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        SortedDirList sortedDirList =new SortedDirList(new File("."));
        display(sortedDirList.list());
        System.out.println("----------------");
        display(sortedDirList.list("^(.xml)"));
    }
}
