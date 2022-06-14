import java.util.List;

public class Girl {
    private String name;
    private int age;
    private List<Doll> dolls;

    public Girl(String name, int age, List<Doll> dolls) {
        this.name = name;
        this.age = age;
        this.dolls = dolls;
    }

    public void setDolls(List<Doll> dolls) {
        this.dolls = dolls;
    }

    public List<Doll> getDolls() {
        return dolls;
    }
}
