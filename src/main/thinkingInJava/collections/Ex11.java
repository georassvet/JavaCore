package main.thinkingInJava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Fruit{
    private String name;
    private double cost;
    public Fruit(String name, double cost){
        this.name=name;
        this.cost=cost;
    }
    @Override
    public String toString() {
        return name+"["+cost+"]";
    }
}
class Coordinate{
    private double lat;
    private double lng;
    public Coordinate(double lat, double lng){
        this.lat=lat;
        this.lng=lng;
    }
    String getCoordinate(){
        return "["+lat+":"+lng+"]";
    }
}
class Run{
    private List<Coordinate> coordinates;
    public Run(){
        coordinates = new ArrayList<>();
    }
    public void addCoordinate(Coordinate coordinate){
        coordinates.add(coordinate);
    }

    @Override
    public String toString() {
        String result="";
        for (Coordinate c:coordinates
             ) {
            result+=c.getCoordinate()+" ";
        }
        return result+"\n";
    }
}
public class Ex11 {
    public static void step(Iterator<?> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
    public static void main(String[] args) {
        Run run =new Run();
        run.addCoordinate(new Coordinate(10.3244,9.2837));
        run.addCoordinate(new Coordinate(7.3221,6.3152));
        run.addCoordinate(new Coordinate(5.1234,8.9431));

        Fruit wl =new Fruit("Waterlemon", 235.00);
        Fruit apple =new Fruit("Apple", 18.00);

        List<Object> list =new ArrayList<>();
        list.add(run);
        list.add(wl);
        list.add(apple);
        list.add(new RuntimeException());

        step(list.iterator());



    }
}
