import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions1 {
    public static void main(String[] args)  {
        File asas = new File("asas");
        try {
            Scanner scanner = new Scanner(asas);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
        System.out.println("После всего");


    }

}
