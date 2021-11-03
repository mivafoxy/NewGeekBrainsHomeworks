import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessTheWord();
    }

/*
   Создать массив из слов String[] words =
   {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
    "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
    "pumpkin", "potato"};
   При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
   сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
   apple – загаданное
   apricot - ответ игрока
   ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
   Для сравнения двух слов посимвольно, можно пользоваться:
   String str = "apple";
   str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
   Играем до тех пор, пока игрок не отгадает слово
   Используем только маленькие буквы
*/
    public static void guessTheWord()
    {
        Random random = new Random();

        String[] words =
                {
                        "apple", "orange", "lemon", "banana", "apricot", "avocado",
                        "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                        "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
                };

        int expectedWordIndex = random.nextInt(words.length);
        String expectedWord = words[expectedWordIndex];
        System.out.println("Загадано: " + expectedWord);

        String userWord;
        Scanner scanner = new Scanner(System.in);
        do
        {
            userWord = scanner.nextLine();

            if (userWord.equals(expectedWord))
            {
                System.out.println("Угадано!");
            }
            else
            {
                doAdvise(userWord, expectedWord);
            }
        }
        while (!(userWord.equals(expectedWord)));
    }

    static void doAdvise(String userWord, String expectedWord)
    {
        String advise = "";
        for (int i = 0; i < 15; i++)
        {
            if (i >= userWord.length() || i >= expectedWord.length())
            {
                advise += "#";
            }
            else if (userWord.charAt(i) == expectedWord.charAt(i))
            {
                advise += userWord.charAt(i);
            }
            else
            {
                advise += "#";
            }
        }

        System.out.println(advise);
    }

}
