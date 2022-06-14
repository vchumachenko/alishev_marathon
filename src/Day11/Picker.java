package Day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
        if (warehouse.getCountOrder()==1500)bonus();

    }

    @Override
    public void bonus() {
        salary*=3;


    }
}
