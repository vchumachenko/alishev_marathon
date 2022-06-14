package Day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int newYear) {  return newYear - year;  }

    public String getColor() {  return color; }
    public void setColor(String color) {   this.color = color;  }
    public String getModel() {     return model;  }
    public void setModel(String model) {   this.model = model;  }
}
