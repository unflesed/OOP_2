package OOP_2.Additional;

public class MyArea {
    private static final double PI = 3.14;
    private double r;
    public MyArea(){}
    public MyArea(double r){
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public static double areaOfCircle(double r){
        return PI * r * r;
    }
}
