import java.util.ArrayList;
import java.util.List;

public class ArrraysL {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");


        String animal = (String) animals.get(1);
        System.out.println(animal);


        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);






    }
}
