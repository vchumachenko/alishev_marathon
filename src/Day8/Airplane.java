package Day8;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel = 0;


    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else System.out.println("Второй самолет длиннее");

    }

    public int getLength() {
        return length;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    void fillUp(int upFuel) {
        fuel += upFuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }
}
