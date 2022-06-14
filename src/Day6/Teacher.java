package Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {       return name;   }
    public void setName(String name) {        this.name = name;    }
    public String getSubject() {        return subject;    }
    public void setSubject(String subject) {        this.subject = subject;    }


    public void evaluate(Student student) {
        Random random = new Random();
        int ocenka = random.nextInt(4) + 2;
        switch (ocenka) {
            case 2 -> System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку неудовлетворительно");
            case 3 -> System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку удовлетворительно");
            case 4 -> System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку хорошо");
            case 5 -> System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку отлично");
        }


    }

}
