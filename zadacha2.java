package homeWork10;

public class zadacha2 {
    public static void main(String[] args) {
        int year = 2012;
        int oS = 0;
        proverka(year, oS);
    }

    public static void proverka(int year, int oS) {
        if (oS > 0) {
            if (year > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        if (oS == 0) {
            if (year > 2015) {
                System.out.println("Установите версию приложения для iOs по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOs по ссылке");
            }
        }
    }
}

