import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RaedingFromfile {
    public static void main(String[] args) throws FileNotFoundException {



        File file = new File("test2");


        System.out.println();
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers  = line.split(" ");
        for (String number :
                numbers) {
            Integer.parseInt(number);
        }


        System.out.println(Arrays.toString(numbers));

        scanner.close();

    }
}
