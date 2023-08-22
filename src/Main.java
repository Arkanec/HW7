public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int balance = 0;
        int month = 0;
        while (balance <= 2459000) {
            balance += 15000;
            ++month;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");

        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a);
            ++a;
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.print(a);
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12000000;
        int feritility = 17;
        int dead = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + (population / 1000 * (feritility - dead));
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        balance = 0;
        month = 0;
        while (balance <= 12000000) {
            balance = balance + 15000;
            balance = (int) (balance * 1.07);
            ++month;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");
        }
        System.out.println("Задача 5");
        balance = 0;
        month = 0;
        while (balance <= 12000000) {
            balance = balance + 15000;
            balance = (int) (balance * 1.07);
            ++month;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");
            }

            System.out.println("Задача 6");
            balance =0;
            for (int i = 1; i <= 108; i++) {
                balance += 15000;
                balance *= 1.07;
                if (i % 6 ==0) {
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + balance + " рублей");
                }

                System.out.println("Задача 7");
                for (int friday = 6; friday <= 31; friday += 7) {
                    System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
                }

                System.out.println("Задача 8");
                int currentYear = 2023;
                int startYear = currentYear - 200;
                int endYear = currentYear + 100;
                for (int b = startYear; b <= endYear; b++) {
                    if (b % 79 ==0) {
                        System.out.println(b);
                    }
                }
            }
        }
    }
}