public class Decimal {
    private int numerator;
    private int denominator;
    static int count;
    public Decimal(){
        count++;
    }
    public Decimal(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
