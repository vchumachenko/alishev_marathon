package Day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);


        for (int i = 0; i <1500 ; i++) {
            picker.doWork();
        }


        System.out.println(picker.getSalary());
        System.out.println(warehouse);


    }

}