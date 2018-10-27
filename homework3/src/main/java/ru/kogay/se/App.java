package ru.kogay.se;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        randomWord(words);

    }
    public static void randomWord(String words[]) {
        System.out.println("Список слов: " + Arrays.toString(words));
        int r = (int) (Math.random() * 26);
        String randomstr = words[r];

        for (int i = 0; i < words.length; i++) {
            System.out.println("Отгадайте слово, загаданное компьютером: ");
            Scanner scanner = new Scanner(System.in);
            String userstr = scanner.nextLine();
            if (randomstr.equals(userstr)) {
                System.out.println("Вы отгадали слово!");
                break;
            }
            else {
                System.out.println("Неверно. Подсказка: " + randomstr.charAt(0) + randomstr.charAt(1) + "###############");
            }
        }
    }
}
