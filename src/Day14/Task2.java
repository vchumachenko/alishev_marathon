package Day14;

import javax.security.sasl.SaslClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people.txt");

        Scanner scanner = new Scanner(file);

        List<String> names = new ArrayList<>();
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            names.add(line);
        }
        System.out.println(names);


    }

//    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
//
//
//
//
//
//
//
//    }
}
