/**
 * 1. Реализовать программу, которая принимает на вход через консоль с помощью
 * класса Scanner , число, соответствующее количеству этажей в здании. Используя
 * условный оператор if , необходимо вывести в консоль сообщение о типе такого дома.
 * <p>
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
 * - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
 * отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */

package Day2;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей в здании");
        int floor = scanner.nextInt();
        if (floor >= 1 && floor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floor >= 5 && floor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floor >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
