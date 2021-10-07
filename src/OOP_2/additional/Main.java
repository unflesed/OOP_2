package OOP_2.additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArea myArea = new MyArea();
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус:");
        r = sc.nextDouble();
        System.out.println("Площадь круга:" + MyArea.areaOfCircle(r));
    }
}
