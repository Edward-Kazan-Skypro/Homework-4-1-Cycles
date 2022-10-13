public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Решение задачи 1");
        int i;
        for (i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Задание 2
        System.out.println("Решение задачи 2");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Задание 3
        System.out.println("Решение задачи 3");
        for (i = 0; i < 17; i = i + 2) {
           System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Задание 4
        System.out.println("Решение задачи 4");
        for (i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Решение задачи - високосный год");
        for (i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println();

        //Задание 2
        System.out.println("Решение задачи:");
        for (i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Задание 3
        System.out.println("Решение задачи:");
        for (i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Решение задачи:");
        int total = 0;
        int cash = 29000;
        for (i = 1; i <=12; i++) {
            total = total + cash;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();

        System.out.println("Решение задачи:");
        total = 0;
        cash = 29000;

        for (i = 1; i <=12; i++) {
            total = total + total/100;
            total = total + cash;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}