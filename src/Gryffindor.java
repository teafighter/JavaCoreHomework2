import java.util.Random;

public class Gryffindor extends Hogwarts {

    // Всем Гриффиндорцам присущи благородство, честь и храбрость.
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String lastname) { // генератор NPC
        super(name, lastname);
        Random random = new Random();
        this.nobility = random.nextInt(100);
        this.honor = random.nextInt(100);
        this.courage = random.nextInt(100);
    }

    public Gryffindor(String name, String lastname, int magic, int apparition, int nobility, int honor, int courage) {
        super(name, lastname, magic, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Студент Гриффиндора " + super.getName() + " " + super.getLastname() +
                ", магическая сила: " + super.getMagic() + ", способность к трансгресии: " + super.getApparition() +
                ", благородство: " + nobility + "/100" +
                ", честь: " + honor + "/100" +
                ", храбрость: " + courage + "/100";
    }

    public int sumProperties() {
        return nobility + honor + courage;
    }

    public static void compare(Gryffindor student1, Gryffindor student2) {
        if (student1.getName().equals("Гарри") && student1.getLastname().equals("Поттер") || (student2.getName().equals("Гарри") && student2.getLastname().equals("Поттер"))) {
            System.out.println("Гарри Поттер лучший гриффиндорец всех времен и народов");
            return;
        }
        if (student1.sumProperties() > student2.sumProperties()) {
            System.out.println(student1.getName() + " лучший гриффиндорец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший гриффиндорец, чем " + student1.getName());
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(byte nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(byte honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(byte courage) {
        this.courage = courage;
    }

}
