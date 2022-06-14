/**
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа
 * данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
 * Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение
 * записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных
 * чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо реализовать статический
 * метод printResult(File file) . Этот метод должен рассчитать сумму всех
 * вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную
 * часть.
 */


package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file = new File("file1.txt");
        PrintWriter file1 = new PrintWriter("file1.txt");

        for (int i = 0; i < 1000; i++)
            file1.println(random.nextInt(100));

        file1.close();

        Scanner scanner = new Scanner(file);
        File file3 = new File("file2.txt");
        PrintWriter file2 = new PrintWriter("file2.txt");
        int counter = 0;
        int sum = 0;

        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20) {
                file2.println(sum / 20.0);
                sum = 0;
                counter = 0;
            }
        }
        file2.close();
        printResult(file3);
    }


    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            while (scanner.hasNextLine()) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            System.out.println((int) sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }


}
