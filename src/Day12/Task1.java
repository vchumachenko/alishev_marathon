package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Maserati");
        cars.add("Lada");
        cars.add("Audi");
        cars.add("BMW");


        System.out.println(cars);
        cars.add(2,"Mazda");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);
    }

}
