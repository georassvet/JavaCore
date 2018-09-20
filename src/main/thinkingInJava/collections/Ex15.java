package main.thinkingInJava.collections;

public class Ex15 {
    public static void main(String[] args) {
        String input = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
        Stack<Character> stack =new Stack<>();

        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
         switch (arr[i]){
             case '+':{
                 stack.push(arr[++i]);
                 break;
             }
             case '-':{
                 stack.pop();
                 i++;
                 break;
             }
             default:{
                 stack.push(arr[i]);
                 break;
             }
         }
        }
        System.out.println(stack);

    }
}
