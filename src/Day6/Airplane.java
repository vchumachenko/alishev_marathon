package Day6;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel= 0;

    public int getFuel() {  return fuel; }

    public void setProducer(String producer) {  this.producer = producer;  }

    public void setYear(int year) {      this.year = year;  }

    public void setLength(int length) {     this.length = length;  }

    public void setWeight(int weight) {      this.weight = weight;  }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    void fillUp(int upFuel){ fuel += upFuel;  }
}
