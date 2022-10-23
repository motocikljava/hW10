package homeWork10;

public class Main {
    public static void main(String[] args) {
        int year = 2004;
        calculatedLeapYear(year);

    }

    public static void calculatedLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}