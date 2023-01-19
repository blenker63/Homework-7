public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15000; // инициализация суммы ежемесячного вклада
        int accumulation = 2_459_000; // инициализация  суммы накопления
        int total = 0; // инициализация первоначальной суммы накопления
        int i = 0;
        while (total <= accumulation) {
            total = total + contribution;
            i = i + 1;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationSize = 12_000_000;
        int birth = 17; // инициализация рождаемости на 1 000 человек
        int rateMortality = 8; // инициализация смерности на 1 000 человек
        int period = 0; //инициализация начального периода
        while (period < 10) {
            period = period + 1;
            populationSize = populationSize + populationSize * birth / 1_000 - populationSize * rateMortality / 1_000;
            System.out.println("Год " + period + ", численность населения составляет " + populationSize);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double contribution = 15000; // инициализация суммы ежемесячного вклада
        double accumulation = 12_000_000; // инициализация  суммы накопления
        double total = 0; // инициализация первоначальной суммы накопления
        int month = 0; // инициализация месяца начала накопления
        double interestRate = 0.07;
        while (total <= accumulation) {
            month = month + 1;
            total = total + contribution + total * interestRate;
            System.out.println("Месяц " + month + " сумма накоплений составляет " + total + " рублей.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double contribution = 15000; // инициализация суммы ежемесячного вклада
        double accumulation = 12_000_000; // инициализация  суммы накопления
        double total = 0; // инициализация первоначальной суммы накопления
        int month = 0; // инициализация месяца начала накопления
        double interestRate = 0.07; // инициализация процентной ставки в месяц
        while (total <= accumulation) {
            month = month + 1;
            total = total + contribution + total * interestRate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений составляет " + total + " рублей.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double contribution = 15000; // инициализация суммы ежемесячного вклада
        double total = 0; // инициализация первоначальной суммы накопления
        int month = 0; // инициализация месяца начала накопления
        int periodYear = 9; // инициализация периода накопления в годах
        int periodMonth = periodYear * 12;  // инициализация количества месяцев накопления
        double interestRate = 0.07; // инициализация процентной ставки в месяц
        while (month <= periodMonth) {
            month = month + 1;
            total = total + contribution + total * interestRate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений составляет " + total + " рублей.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        System.out.println(" Вариант 1 с использованием for");
        int dateFriday = 1; // инициализация даты первой пятницы в месяце
        int daysMonth = 31; // инициализация количества дней в месяце
        {
            for (; dateFriday <= daysMonth; dateFriday = dateFriday + 7) {
                System.out.println("Сегодня пятница, " + dateFriday + "-е число. Необходимо подготовить отчет.");
            }
        }
        {
            System.out.println("Вариант 2 с использованием while");
            int dateFridayTwo = 1; // инициализация даты первой пятницы в месяце
            int daysMonthTwo = 31; // инициализация количества дней в месяце
            while (dateFridayTwo <= daysMonthTwo) {
                System.out.println("Сегодня пятница, " + dateFridayTwo + "-е число. Необходимо подготовить отчет.");
                dateFridayTwo = dateFridayTwo + 7;
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 0; // инициализация начального года пролета кометы
        int period = 79; // инициализация периодичности пролета кометы
        int yearCurrent = 2023; // инициализация текущего года
        int periodBeginning = 200; // инициализация периода до текущего года
        int periodEnd = 100; // инициализация периода после текущего года
        int yearBeginning = yearCurrent - periodBeginning; // инициализация года начала периода наблюдения
        int yearEnd = yearCurrent + periodEnd; // инициализация года окончания периода наблюдения
        for (; year <= yearEnd; ) {
            year = year + period;
            if (year >= yearBeginning && year <= yearEnd)
                System.out.println(year);
        }
    }
}
