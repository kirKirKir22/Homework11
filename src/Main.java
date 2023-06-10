import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void defineTheYear1(int year1) {
        if (year1 % 4 == 0 && year1 != 100 || year1 % 400 == 0) {
            System.out.println(year1 + " год — високосный год");
        } else {
            System.out.println(year1 + " год — невисокосный год");
        }
    }

    public static void determinesTheVersionIOfTheOperatingSystem(int clientYear, int clientOS) {

        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();

        if (clientOS == iOs) {
            if (clientYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientYear > currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == android) {
            if (clientYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientYear > currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("ОС не поддерживается");
        }
    }

    public static int countDeliveryDays(int deliveryDistance) {

        int deliveryDay = -1;

        if (deliveryDistance < 20) {
            deliveryDay = 1;
        } else if (deliveryDistance < 60) {
            deliveryDay = 2;
        } else if (deliveryDistance < 100) {
            deliveryDay = 3;
        }
        return deliveryDay;
    }

    private static void task1() {
        System.out.println("Задача 1");

        int year = 2021;

        defineTheYear1(year);
    }

    private static void task2() {
        System.out.println("Задача 2");

        int clientYear = 2022;
        int clientOS = 1;

        determinesTheVersionIOfTheOperatingSystem(clientYear, clientOS);
    }

    private static void task3() {
        System.out.println("Задача 3");

        int days = countDeliveryDays(1);

        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка невозможна");
        }
    }
}

