package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Job{
    private String description;
    private double cost;

    public Job(String description, double cost){
        this.description=description;
        this.cost=cost;
    }
    public void info(){
        System.out.println("Job: "+description
                            +"\nCost: "+cost);
        System.out.println("------------------");
    }
}

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<Job> jobs =new ArrayList<>();
        System.out.println("jobs.isEmpty()" + jobs.isEmpty());
        System.out.println("Добавление элементов");
        jobs.add(new Job("Монтаж скс в Москве", 50.00));
        jobs.add(new Job("Установка видеонаблюдения", 100.00));
        jobs.add(new Job("Написание программы", 200.00));
        System.out.println("Добавленны");
        System.out.println("jobs.isEmpty()" + jobs.isEmpty());
        System.out.println(jobs.contains(new Job("Курьер",10.00)));

        Iterator<Job> it = jobs.iterator();

        while (it.hasNext()){
            Job job = it.next();
            job.info();
        }

        Job jb =new Job("Programmer",230.00);
        jobs.add(jb);

        System.out.println("jobs.contains(jb)" + jobs.contains(jb));
        System.out.println("jobs.remove(jb)" + jobs.remove(jb));

        Job[] arr = jobs.toArray(new Job[jobs.size()]);
        for (Job a: arr
             ) {
                a.info();
        }
        jobs.clear();

        System.out.println(jobs);








    }
}
