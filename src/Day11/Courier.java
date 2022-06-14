package Day11;

public class Courier  implements Worker {
    private double salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance()+1000);
        if (warehouse.getBalance()==1000000)bonus();
    }

    @Override
    public void bonus() {
        salary*=2;

    }
}
