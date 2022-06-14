/**
 * 4. Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */


package Day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array  = new int [100];
        for (int i = 0; i < array.length ; i++)
            array[i] = random.nextInt(1000);




    }
}
