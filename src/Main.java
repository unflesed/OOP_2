import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decimal decimal1 = new Decimal();
        System.out.println("Введите числитель первой дроби:");
        decimal1.setNumerator(sc.nextInt());
        System.out.println("Введите знаменатель первой дроби:");
        decimal1.setDenominator(sc.nextInt());
        System.out.println("Введите числитель и знаменатель второй дроби: ");
        Decimal decimal2 = new Decimal(sc.nextInt(),sc.nextInt());
        System.out.println("Сумма:");
        System.out.println(decimal1.getNumerator() * decimal2.getDenominator() + decimal2.getNumerator() *
                decimal1.getDenominator() + "/" + decimal1.getDenominator()* decimal2.getDenominator());
        System.out.println("Вычитание:");
        System.out.println(decimal1.getNumerator() * decimal2.getDenominator() - decimal2.getNumerator()*
                decimal1.getDenominator() + "/" + decimal1.getDenominator()* decimal2.getDenominator());
        System.out.println("Произведение:");
        System.out.println(decimal1.getNumerator() * decimal2.getNumerator() + "/"
                + decimal1.getDenominator()* decimal2.getDenominator());
        System.out.println("Деление:");
        System.out.println(decimal1.getNumerator() * decimal2.getDenominator() + "/"
                + decimal1.getDenominator() * decimal2.getNumerator());
        System.out.println("Количество объектов: " + Decimal.count);
    }
}
