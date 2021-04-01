

public class HomeWorkApp
{
    public static void main(String[] args)
    {
        System.out.println("Task 1.");
        int a = 0;
        int b = 1;
        boolean isBetween = isSumBetween10And20(a, b);
        System.out.println(isBetween);

        System.out.println("Task 2.");
        printSignOf(5);

        System.out.println("Task 3.");
        boolean isNegative = isNegative(-2);
        System.out.println(isNegative);

        System.out.println("Task 4.");
        print("Hello world!", 5);

        System.out.println("Task 5.");
        boolean isLeap = isLeapYear(2020);
        System.out.println(isLeap);
    }

    // 1. Написать метод, принимающий на вход два целых числа
    // и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean isSumBetween10And20(int left, int right)
    {
        int sum = left + right;
        return 10 < sum && sum <= 20;
    }

    // 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void printSignOf(int number)
    {
        if (number >= 0)
        {
            System.out.println("Число положительное!");
        }
        else
        {
            System.out.println("Число отрицательное!");
        }
    }

    // 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static boolean isNegative(int number)
    {
        return number < 0;
    }

    // 4. Написать метод,
    // которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку,
    // указанное количество раз;
    public static void print(String message, int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(message);
        }
    }

    // 5. * Написать метод,
    // который определяет, является ли год високосным,
    // и возвращает boolean
    // (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным,
    // кроме каждого 100-го,
    // при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year)
    {
//        if (year % 4 == 0 && year % 100 != 0)
//        {
//            return true;
//        }
//        else if (year % 400 == 0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

        // return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void printWordNTimes(String word, int times)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.print(word);
        }
    }
}
