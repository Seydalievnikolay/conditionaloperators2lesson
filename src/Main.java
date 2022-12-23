public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1(){
        System.out.println("Задача №1");
        int clientOS= 1;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ваша система не подходит");

        }
    }
    public static void task2() {
        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS==1 && clientDeviceYear >= 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if(clientOS==1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientOS==0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS==0 && clientDeviceYear <= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }
    public static void task3() {
        System.out.println("Задача №3");
        int year = 1992;
        switch (year){
            case 1989:
            case 1990:
            case 1991:
                System.out.println("Год не является високосным ");
                break;
            case 1992:
                System.out.println("Год является високосным");
                break;
            default:
                System.out.println("Такого года нет");

        }

    }
    public static void task4() {
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        if (deliveryDistance<20) {
            System.out.println("Потребуется 1 день");
        } if (deliveryDistance>20 && deliveryDistance<60){
            System.out.println("Потребуется 2 дня");
        } if (deliveryDistance>60 && deliveryDistance<100){
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5() {
        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 01:
            case 02:
                System.out.println("Зима ");
                break;
            case 03:
            case 04:
            case 05:
                System.out.println("Весна");
                break;
            case 06:
            case 07:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого года нет");
        }

    }
}