import java.util.Arrays;

public class HomeworkApp
{
    // Точка входа, в которой мы начинаем наше программирование, всегда.
    public static void main(String[] args)
    {
        //
        // Задание 1.
        //

        System.out.println("Task 1.");
        // Делаем это вне метода, так как это - входные данные.
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        System.out.println(Arrays.toString(array));
        changeZeroesAndOnes(array);
        System.out.println(Arrays.toString(array));

        //
        // Задание 2.
        //

        System.out.println("Task 2.");
        int[] secondArray = new int[100];

        System.out.println(Arrays.toString(secondArray));
        fillArrayWithSequence(secondArray);
        System.out.println(Arrays.toString(secondArray));

        //
        // Задание 3.
        //

        System.out.println("Task 3.");
        int[] thirdArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println(Arrays.toString(thirdArray));
        doubleNumbersLessThanSixIn(thirdArray);
        System.out.println(Arrays.toString(thirdArray));

        //
        // Задание 4.
        //

        System.out.println("Task 4.");

        int[][] square = new int[10][10];
        System.out.println("With zeroes");
        printSquare(square);

        fillDiagonalsWithOnes(square);
        System.out.println("With ones.");
        printSquare(square);

        //
        // Задание 5.
        //

        System.out.println("Task 5.");

        int initialValue = 10;
        int size = 5;

        int[] fourthArray = getNewArrayWith(initialValue, size);
        System.out.println(Arrays.toString(fourthArray));

        //
        // Задание 6.
        //

        System.out.println("Task 6.");

        int[] minMaxArray = { 1, 2, 7, 4, 0 };
        System.out.println(Arrays.toString(minMaxArray));

        printMinAndMax(minMaxArray);

        //
        // Задание 7.
        //

        System.out.println("Task 7.");

        int[] sumsArray = { 1, 1, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(sumsArray));
        boolean isBalanced = hasBalance(sumsArray);
        System.out.println("Суммы правой и левой части где либо равны? " + isBalanced);

        //
        // Задание 8.
        //

        System.out.println("Task 8.");

        int[] rightShiftArray = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(rightShiftArray));
        shiftArray(rightShiftArray, 3);
        System.out.println(Arrays.toString(rightShiftArray));


        int[] leftShiftArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(leftShiftArray));
        shiftArray(leftShiftArray, -5);
        System.out.println(Arrays.toString(leftShiftArray));
    }

    // Вспомогательный метод для вывода двумерного
    // массива на экран.
    public static void printSquare(int[][] inputSquare)
    {
        for (int i = 0; i < inputSquare.length; i++)
        {
            System.out.println(Arrays.toString(inputSquare[i]));
        }
    }


    // 1. Задать целочисленный массив,
    // состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия
    // заменить 0 на 1, 1 на 0;
    public static void changeZeroesAndOnes(int[] inputArray)
    {
        // Массивы - это ссылочные типы. То есть, по сути,
        // в метод передаётся адрес, на который указывает входной аргумент.
        // А значит - любые изменения массива внутри метода
        // в результате окажутся в array из main.

        // С помощью цикла
        for (int i = 0; i < inputArray.length; i++)
        {
            // используем условие
            // inputArray[i] = (inputArray[i] == 1) ? 0 : 1;

            // Можно сделать проще.
            inputArray[i] = 1 - inputArray[i];
        }
    }

    // 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями
    // 1 2 3 4 5 6 7 8 … 100;
    public static void fillArrayWithSequence(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (i + 1);
        }
    }

    // 3. Задать массив
    // [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    static void doubleNumbersLessThanSixIn(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++) // пройти по нему циклом
        {
            // числа меньшие 6 умножить на 2
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }

    // 4. Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов)
    // заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonalsWithOnes(int[][] square)
    {
        //с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        for (int i = 0; i < square.length; i++)
        {
            // диагональные элементы имеют одинаковые индексы
            square[i][i] = 1;

            // заполнение другой диагонали
            square[i][square[i].length - 1 - i] = 1;
        }
    }

    // 5. Написать метод,
    // принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue;
    public static int[] getNewArrayWith(int initialValue, int length)
    {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = initialValue;
        }
        return result;
    }

    // 6. * Задать одномерный массив
    // и найти в нем минимальный
    // и максимальный элементы
    public static void printMinAndMax(int[] inputArray)
    {
        int min = inputArray[0];
        int max = inputArray[0];

        // простой перебор массива.
        for (int i = 1; i < inputArray.length; i++)
        {
            if (min > inputArray[i])
            {
                min = inputArray[i];
            }

            if (max < inputArray[i])
            {
                max = inputArray[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // 7. ** Написать метод,
    // в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true,
    // если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    //**Примеры:
    //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    public static boolean hasBalance(int[] inputArray)
    {
        int leftSum = 0;
        for (int i = 0; i < inputArray.length; i++)
        {
            leftSum += inputArray[i];

            int rightSum = 0;
            for (int j = (i + 1); j < inputArray.length; j++)
            {
                rightSum += inputArray[j];
            }

            if (leftSum == rightSum)
            {
                return true;
            }
        }

        return false;
    }

    // 8. *** Написать метод,
    // которому на вход подается одномерный массив
    // и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static void shiftArray(int[] array, int shift)
    {
        // В какую сторону надо перемещать элементы массива?
        if (shift < 0)
        {
            // Цикл идёт влево.
            for (int i = 0; i > shift; i--)
            {
                leftShift(array);
            }
        }
        else
        {
            // Цикл идёт вправо.
            for (int i = 0; i < shift; i++)
            {
                rightShift(array);
            }
        }
    }

    public static void rightShift(int[] inputArray)
    {
        // первым делом - заменить первый элемент последним. Но первый элемент терять нельзя.
        int buffer = inputArray[0];
        inputArray[0] = inputArray[inputArray.length - 1];

        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[inputArray.length - j] = inputArray[inputArray.length - j - 1];
        }

        inputArray[1] = buffer;
    }

    public static void leftShift(int[] inputArray)
    {
        int buffer = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = inputArray[0];

        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[j - 1] = inputArray[j];
        }

        inputArray[inputArray.length - 2] = buffer;
    }
}
