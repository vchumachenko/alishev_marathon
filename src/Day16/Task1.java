/**
 * 1. Реализовать программу, которая на вход принимает txt файл с целыми числами
 * (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
 * консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную
 * запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
 * (с 3 знаками после запятой).
 * Детали реализации: В классе Task1 создать публичный статический метод
 * printResult(File file) , в котором реализовать вышеописанную логику. В методе
 * main() класса Task1 вызвать метод printResult(File file) , передав ему в
 * качестве аргумента объект класса File ( txt файл с целыми числами).
 */


package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("test2");
        try {
            printResult(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }


    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()){
            numbers.add(scanner.nextInt());
        }
        int leng = numbers.size();
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double result = sum/leng;
        System.out.printf(result + "---->%.3f", result);







    }





}
