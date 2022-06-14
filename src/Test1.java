import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll("Barbie","Mattel"));
        dollList.add(new Doll("Princess","Hasbro"));


        Girl mary = new Girl("Mary", 12, dollList);


        Girl girl = new Girl("Mary", 12, Arrays.asList(new Doll("Dildo", "katrin"), new Doll("Dildo2", "Katerina")));

        for (Doll doll :girl.getDolls()) {
            System.out.println(doll.getName());

        }

        }

    }



