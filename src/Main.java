import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1\n");
        int year = 2021;
        checkLeapYear(year);
        System.out.println("\nЗадача 2\n");
        int yearOfDevice = 2023;
        int OS = 1;
        chengeVersionMessage(yearOfDevice, OS);
        System.out.println("\nЗадача 3\n");
        int distance = 45;
        calculationOfDelivery(distance);
    }
    public static void checkLeapYear(int year) {
        String message = "";
        if (year <= 1584) {
            message = "Високосный год был введён с 1582 года\n";
        } else if (year % 4 != 0 || year % 400 != 0 && year % 100 == 0) {
            message = "%s год - не високосный год\n";
        } else {
            message = "%s год - високосный год\n";
        }
        System.out.printf(message, year);
    }
    public static void chengeVersionMessage(int year, int OS) {
        String message = "";
        if (year >= 2015 && OS == 0) {
            message = "Установите версию приложения для IOS по ссылке";
        } else if (year >= 2015 && OS == 1) {
            message = "Установите версию приложения для Android по ссылке";
        } else if (OS == 0) {
            message = "Установите облегченную версию приложения для IOS по ссылке";
        } else if (OS == 1) {
            message = "Установите облегченную версию приложения для Android по ссылке";
        }
        System.out.println(message);
    }
    public static void calculationOfDelivery(int distance) {
        int deliveryTime = 0;
        String message = "Свыше 100 км доставки нет\n";
        if (distance < 20) {
            deliveryTime = 1;
            message = "Потребуется дней: %d\n";
        } else if (distance >= 20 && distance < 60) {
            deliveryTime = 2;
            message = "Потребуется дней: %d\n";
        } else if (distance >= 60 && distance < 100) {
            deliveryTime = 3;
            message = "Потребуется дней: %d\n";
        }
        System.out.printf(message, deliveryTime);
    }
}
