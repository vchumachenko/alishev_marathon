/**
 * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */

package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(10);

        int eight = 0;
        int one = 0;
        int x = 0;
        int y = 0;
        int sum = 0;
        for (int i : array) if (i > 8) eight++;
        for (int i : array) if (i == 1) one++;
        for (int i : array) if (i % 2 ==0) x++;
        for (int i : array) if (i % 2 !=0) y++;
        for (int i : array) sum +=i;


        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива " + array.length);
        System.out.println("Количестве чисел больше 8: " + eight);
        System.out.println("Количестве чисел равных 1: " + one);
        System.out.println("Количестве четных чисел: " + x);
        System.out.println("Количестве нечетных чисел: " + y);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
