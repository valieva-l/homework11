import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Результат задача 1
        int year = 2000;
        System.out.println(definitionLeapYear(year));
        // Результат задача 2
        int clientOS = 0;
        int clientDeviceYear = 2017;
        System.out.println(getVersionOS(clientOS, clientDeviceYear));
        getDistance(101);

    }

    // Задача 1
    public static String definitionLeapYear(int year) {
        if (year > 1584 && ((year % 4 == 0) && year % 100 != 0) || year % 400 == 0) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }

    // Задача 2
    public static String getVersionOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
    }

    //Задача 3
    public static int getDistance(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance < 20) {
            days = 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = 2;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days = 3;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        return days;

    }

}



