package main.thinkingInJava.collections;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
      static class ToDoItem implements Comparable<ToDoItem> {
          char primary;
          int secondary;
          String description;

          public ToDoItem(String description, char primary, int secondary) {
              this.description = description;
              this.primary = primary;
              this.secondary = secondary;
          }

          @Override
          public int compareTo(ToDoItem o) {
              if (this.primary > o.primary) {
                  return +1;
              } else if (this.primary == o.primary) {
                  if (this.secondary > o.secondary) {
                      return +1;
                  } else if (this.secondary == o.secondary) {
                      return 0;
                  }
              }
              return -1;
          }

          @Override
          public String toString() {
              return Character.toString(this.primary) + this.secondary + " : " + this.description;
          }
      }
      public void add(char primary, int secondary, String description){
            super.add(new ToDoItem(description,primary,secondary));
      }
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.add('A',1,"Найти работу");
        list.add('C',2,"Сходить в продуктовый");
        list.add('B',1,"Построить дом");
        list.add('A',3,"Вступить в сообщество");
        list.add('C',1,"Почитать книгу");
        list.add('C',3,"Duolingo");
        list.add('B',2,"Посадить дерево");
        list.add('A',1,"Выучить Java");

        for (ToDoItem item: list
             ) {
            System.out.println(item);
        }
    }
}
