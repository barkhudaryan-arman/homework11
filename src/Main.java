import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2024);
        checkLeapYear(2020);
        checkLeapYear(2018);


        checkerDeviceClient(1, 2014);
        checkerDeviceClient(0, 2024);
        checkerDeviceClient(1, 2024);


        int days = calculateDistance(56);
        System.out.println("Количество дней = " + days);
    }
    public static void checkLeapYear(int yearToCheck) {
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
            System.out.println("Год " + yearToCheck + " високосный");
        } else {
            System.out.println("Год " + yearToCheck + " не високосный");
        }
    }
    public static void checkerDeviceClient(int deviceOS, int deviceYear) {
        if (deviceYear < 0) {
            System.out.println("Год не может быть меьше 0!");
        }else{
            int currentYear = LocalDate.now().getYear();
            var type = deviceOS == 1 ? "Android" : "iOS";
            var appType = deviceYear < currentYear ? "облегченную" : "";
            System.out.println("Установите " + appType + " версию для системы " + type);
        }
    }
    public static int calculateDistance(int distance) {
        if (distance > 100) {
            return -1;
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}
