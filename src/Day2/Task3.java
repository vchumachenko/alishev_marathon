/**
 * 3. Реализовать программу №2, используя цикл while
 */

package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Некорректный ввод");
        }

        int i = a;
        while (i < b) {
            i++;
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);

            }
        }
    }
}
