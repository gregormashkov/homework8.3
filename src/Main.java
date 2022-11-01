public class Main {
    public static void main(String[] args) {
        // Задание 1.
        int d = 0;
        int perMonth = 15000;
        int m = 0;
        while (d <= 2_459_000) {
            m = m + m / 100;
            d = d + perMonth;
            m++;
            System.out.println("Месяц " + m + "сумма накоплений равна " + d + "рублей");
        }
        // Задание 2.
        int x = 1;
        while (x <= 10) {
            System.out.println("Итерация цикла " + x);
            x++;
        }
        for (; x > 0; x--) {
            System.out.println("Итерация цикла " + x);
        }
        // Задание 3.
        int popY = 12000000;
        int birth = 17 / 1000;
        int death = 8 / 1000;
        int year = 0;
        while (year >= 10) {
            year = year + birth - death;
            year = year + popY;
            System.out.println("Год " + year + ",население составляет " + popY + "человек");
        }
        // Задание 4.
        int sum = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12000000; i++) {
            total = total + total / 100;
            total = total + sum;
        }
        if (i % 5 == 0) {
            System.out.println("Месяц " + i + "промежуточная сумма " + total);
        }
        // Задание 5.
        int sum1 = 15000;
        int total1 = 0;
        int i1 = 0;
        for (; total1 < 12000000; i1++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + sum1;
        }
        if (i1 % 5 == 6) {
            System.out.println("Месяц " + i1 + "промежуточная сумма " + total1);
        }
        // Задание 6.
        int sum2 = 15000;
        int total2 = 0;
        int i2 = 0;
        for (; i2 == 108; i2++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + sum2;
        }
        if (i2 % 6 == 18) {
            System.out.println("Месяц " + i2 + "промежуточная сумма " + total2);
        }
        // Задание 7.
        int friday = 7;
        int sumDayMonth = 31;
        for (friday = 7; sumDayMonth == 31; friday++) ;
        if (sumDayMonth % 7 == 3) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
        }
        // Задание 8.
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int j = beginning; j < ending; j++) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
        }
        // Задание 9.
        for (int j = 1; j < 10; j++) {
            System.out.println("2 * " + j + " = " + 2 * j);
        }
    }
}




