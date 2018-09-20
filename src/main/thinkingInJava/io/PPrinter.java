package main.thinkingInJava.io;

import java.util.Arrays;
import java.util.Collection;

public class PPrinter {
    public static String pformat(Collection<?> c){
        if(c.size()==0)
            return "[]";
            StringBuilder sb = new StringBuilder("[");
            for (Object s : c
                 ) {
               if(c.size()!=1){
                   sb.append("\n ");
               }
                sb.append(s);
            }
            if(c.size()!=1){
                sb.append("\n ");
                sb.append("]");
            }
            return sb.toString();
    }
    public static void pprint(Collection<?> c){
        System.out.println(pformat(c));
    }
    public static void pprint(Object[] c){
        System.out.println(pformat(Arrays.asList(c)));
    }
}
