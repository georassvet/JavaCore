package main.myunderstanding;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class User{
    private String name;
    private int age;

    public User(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return name+", "+age;
    }
}

class Post{
    private static int counter;
    private int id;
    private String name;
    private String description;
    private List<Comment> comments;


    public Post(String name, String description){
        id=++counter;
        this.name=name;
        this.description=description;
        comments=new ArrayList<>();
    }
    void addComment(Comment comment){
        comments.add(comment);
    }

    public String toString(){
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Post №"+id+" "+name+"\n"+description+"\n");
        for (Comment c:comments
             ) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
class Comment{
    static int counter;
    private int id;
    private User author;
    private String message;

    public Comment(User author, String message){
        id=++counter;
        this.author=author;
        this.message=message;
    }

    @Override
    public String toString() {
        return author+"\n"+message+"\n-------\n";
    }
}

public class MyList {
    public static void main(String[] args) {
        User smokhov =new User("Sergey Mokhov", 28);
        User amokhov =new User("Alexey Mokhov", 29);
        Post post= new Post("Спортивная хотьба", "Активный образ жизни, убирает границы");
        post.addComment(new Comment(smokhov,"Во сколько начало?"));
        post.addComment(new Comment(amokhov,"В 18:00"));
        post.addComment(new Comment(smokhov,"Не подскажешь, где?"));
        post.addComment(new Comment(amokhov,"В Караганде"));
        post.addComment(new Comment(smokhov,"Спасибо"));

        System.out.println(post);

        List<Integer> lenta = new LinkedList<>();
        //lenta.get(2);
        ((LinkedList<Integer>) lenta).addFirst(1);
        ((LinkedList<Integer>) lenta).addLast(1);
        ((LinkedList<Integer>) lenta).element();
        ((LinkedList<Integer>) lenta).getFirst();
        ((LinkedList<Integer>) lenta).getLast();
        ((LinkedList<Integer>) lenta).removeLast();
        ((LinkedList<Integer>) lenta).removeFirst();
        ((LinkedList<Integer>) lenta).peek();
        ((LinkedList<Integer>) lenta).poll();
        ((LinkedList<Integer>) lenta).pollFirst();
        ((LinkedList<Integer>) lenta).pollLast();
        ((LinkedList<Integer>) lenta).offer(1);
        ((LinkedList<Integer>) lenta).offerFirst(1);
        ((LinkedList<Integer>) lenta).offerLast(2);

    }
}
