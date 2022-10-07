public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int total1 = 0;
        int i = 0;
        for (i = 1; total1 <= 2459000; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + 15000;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей.");

        System.out.println("Задание 1.2");
        int o = 0;
        while (10 > o) {
            o = o + 1;
        System.out.print(o + " ");
    }
        System.out.println(" ");
        for (o = 10; o >= 1; o = o - 1) {
            System.out.print(o + " ");
        }
        System.out.println(" ");
        System.out.println("Задание 1.3");
        int population = 12000000;

        for (int y = 1; y <= 10; y ++) {
            int up = 17 * population / 1000;
            int down = 8 * population / 1000;
            population = population + up - down;
            System.out.println("Год " + y + " численность населения составляет " + population + " человек");
        }
        System.out.println("Задание 2.1");
        double total = 0;
        for (int l = 1; total <= 12000000; l++) {
          total = (total * 1.07 + 15000);
            System.out.println("Месяц " + l + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задание 2.2");
        double total2 = 0;
        for (int l = 1; total2 <= 12000000; l++) {
            total2 = (total2 * 1.07 + 15000);
            if (l % 6 == 0) {
                System.out.println("Месяц " + l + ", сумма накоплений равна " + total2 + " рублей.");
            }
        }
        System.out.println("Задание 2.3");
        double total3 = 0;
        for (int l = 1; l <= (9 * 12); l++) {
            total3 = (total3 * 1.07 + 15000);
            if (l % 6 == 0) {
                System.out.println("Месяц " + l + ", сумма накоплений равна " + total3 + " рублей.");
            }
        }
            System.out.println("Задание 2.4");
            int frayday = 4;
            for (frayday = frayday; frayday <= 31; frayday = frayday + 7) {
                System.out.println("Сегодня пятница " + frayday + "-е число. Необходимо подготовить отчет.");
            }
        System.out.println("Задание 3.1");
            int currentYear = 2022;
            for (int yearOfCommet = 0; yearOfCommet <= (currentYear + 100); yearOfCommet = yearOfCommet + 79) {
               if (yearOfCommet >= (currentYear - 200)) {
                   System.out.println(yearOfCommet);
               }
            }
        System.out.println("Задание 3.2");
            int nameOfTable = 2;
            for (int h = 1; h <= 10; h++) {
                System.out.println(nameOfTable + "*" + h + "=" + nameOfTable*h);
            }
        }
        }


