import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int a = 2024;
        year(a);
    }
    public static void year(int yearToCheck) {
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
    public static int calculateDistante(int distante){
        if (distante > 100){
            return -1;
        }
        int days = 1;
        if (distante > 20){
            days++;
        }
        if (distante > 60){
            days++;
        }
        return days;
    }
}
