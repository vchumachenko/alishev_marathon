/**
 * 1. Создать класс Автомобиль (англ. Car ), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */


package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1993);
        car.setColor("White");
        car.setModel("Model1");
        System.out.println(car.getColor());
        System.out.println(car.getYear());
        System.out.println(car.getModel());


        Motorbike motorbike = new Motorbike(2000, "white", "Model2");
        System.out.println(motorbike.getColor() + "\n" +motorbike.getModel() +"\n"+ motorbike.getYear());

    }
}
