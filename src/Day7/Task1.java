/**
 * 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
 * дня.
 * В классе Самолет создать статический метод compareAirplanes , который в
 * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 * сообщение в консоль о том, какой из самолетов длиннее.
 */


package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane an = new Airplane("AN", 2000, 40, 3030);
        Airplane boeing = new Airplane("Boeing", 2000, 41, 3131);
        System.out.println(an);
        Airplane.compareAirplanes(an, boeing);


    }
}
