package Day14;

/**
 * Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File day14 = new File("Day14");
        try {
            printSumDigits(day14);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }


    }

    public static int printSumDigits(File file) throws FileNotFoundException {


        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        if (numbersString.length != 10)
            throw new IllegalArgumentException();

        int[] numbers = new int[10];

        int counter = 0;
        for (String number :
                numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        scanner.close();
        return sum;


    }
}
