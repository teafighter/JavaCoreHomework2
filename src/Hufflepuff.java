import java.util.Random;

public class Hufflepuff extends Hogwarts {

    // Студенты Пуффендуя трудолюбивы, верны, честны.
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String lastname) { // генератор NPC
        super(name, lastname);
        Random random = new Random();
        this.hardworking = random.nextInt(100);
        this.loyalty = random.nextInt(100);
        this.honesty = random.nextInt(100);
    }

    public Hufflepuff(String name, String lastname, int magic, int apparition, int hardworking, int loyalty, int honesty) {
        super(name, lastname, magic, apparition);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент Пуффендуя " + super.getName() + " " + super.getLastname() +
                ", магическая сила: " + super.getMagic() + ", способность к трансгресии: " + super.getApparition() +
                ", трудолюбие: " + hardworking + "/100" +
                ", верность: " + loyalty + "/100" +
                ", честность: " + honesty + "/100";
    }
    public int sumProperties() {
        return hardworking + loyalty + honesty;
    }

    public static void compare(Hufflepuff student1, Hufflepuff student2) {
        if (student1.sumProperties() > student2.sumProperties()) {
            System.out.println(student1.getName() + " лучший пуффендуец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший пуффендуец, чем " + student1.getName());
    }
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(byte hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(byte loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(byte honesty) {
        this.honesty = honesty;
    }
}
