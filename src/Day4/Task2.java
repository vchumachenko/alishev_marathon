/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * - наибольший элемент массива +
 * - наименьший элемент массива +
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено.
 */

package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[30];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }


        int max = 0;
        int min = 10000;
        int nol = 0;
        int sum = 0;
        for (int i : array) if (i > max) max = i;
        for (int i : array) if (i < min) min = i;
        for (int i : array) if (i % 10 == 0) nol++;
        for (int i : array) if (i % 10 == 0) sum += i;
        System.out.println(Arrays.toString(array));
        System.out.println(min);
        System.out.println(max);
        System.out.println(nol);
        System.out.println(sum);


    }
}
