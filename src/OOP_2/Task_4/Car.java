package OOP_2.Task_4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;
    public Car(){
        this(2017, 200, 2000, "Yellow");
    }
    public Car(int year){
        this(250, 1500, "Red");
        this.year = year;
    }
    public Car(int year, double speed){
        this();
        this.year = year;
        this.speed = speed;
    }
    public Car(double speed, int weight, String color){
        this(2013, 300);
        this.weight = weight;
        this.color = color;
    }
    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
