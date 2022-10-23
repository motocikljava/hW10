package homeWork10;

import java.util.Arrays;

public class zadacha3 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        System.out.println(dostavka(deliveryDistance));


    }
    public static int dostavka (int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay ++;
        }
        if (deliveryDistance > 60) {
            deliveryDay ++;
        }
        if (deliveryDistance >120) {
            deliveryDay ++;
        }
        return deliveryDay;
    }
}
