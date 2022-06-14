package Day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Анна Васильевна Чумаченко", "Георграия");
        Student kolya = new Student("Николай");
        teacher.evaluate(kolya);
    }
}
