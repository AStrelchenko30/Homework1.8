package ru.skypro;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int year = 2000;
        printLeapYear(year);
        needInstall(2012, 0);
        int resultDelivery = needDays(35);
        System.out.println("Потребуется дней: " + resultDelivery);

    }

    public static void printLeapYear(int ourYear) {
        boolean isLeapYEar = ((ourYear % 4 == 0 && ourYear != 100) || ourYear % 400 == 0);
        if (isLeapYEar) {
            System.out.println(ourYear + "-високосный год");
        } else {
            System.out.println(ourYear + "-не високосный год");
        }

    }

    public static void needInstall(int Year, int system) {
        if (system == 0 && Year > 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (system != 0 && Year > 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        }
        if (system == 0 && Year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (system != 0 && Year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int needDays(int distence) {
        int deliveryDays = 0;
        if (distence <= 20) {
            deliveryDays += 1;
        }
        if (distence > 20 && distence <= 60) {
            deliveryDays += 2;
        }
        if (distence > 60 && distence <= 100) {
            deliveryDays += 3;
        }
        return deliveryDays;
    }


}
