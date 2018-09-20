package main.thinkingInJava.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Command {
    private String command;

    public Command(String command){
        this.command =command;
    }
    public void operation(){
        System.out.println(command);
    }

}
class CommandList{
    Queue<Command> fill(int size){
        Queue<Command> result =new LinkedList<>();
        Random random =new Random();
        String s;
        for (int i = 0; i <size ; i++) {
          switch (random.nextInt(5)) {
              case 0:{
                 s="Go right";
                 break;
              }
              case 1:{
                  s="Go left";
                  break;
              }case 2:{
                  s="Go back";
                  break;
              }case 3:{
                  s="Go toward";
                  break;
              }case 4:{
                  s="Go up";
                  break;
              }
              case 5:{
                  s="Go down";
                  break;
              }
              default:{
                  s="stop";
                  break;
              }
          }
            Command command =new Command(s);
            result.offer(command);
        }
        return result;
    }
}
class OperationCenter{
    public static void main(String[] args) {
        CommandList commandList =new CommandList();
        Queue<Command> queue = commandList.fill(12);

        while(queue.peek()!=null){
            queue.remove().operation();
        }
    }
}
