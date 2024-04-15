import java.util.Random;

public class Ravenclaw extends Hogwarts {

    // Когтевранцы умны, мудры, остроумны и полны творчества.
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String lastname) { // генератор NPC
        super(name, lastname);
        Random random = new Random();
        this.intelligence = random.nextInt(100);
        this.wisdom = random.nextInt(100);
        this.wit = random.nextInt(100);
        this.creativity = random.nextInt(100);
    }

    public Ravenclaw(String name, String lastname, int magic, int apparition, int intelligence, int wisdom, int wit, int creativity) {
        super(name, lastname, magic, apparition);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Студент Когтеврана " + super.getName() + " " + super.getLastname() +
                ", магическая сила: " + super.getMagic() + ", способность к трансгресии: " + super.getApparition() +
                ", ум: " + intelligence + "/100" +
                ", мудрость: " + wisdom + "/100" +
                ", остроумие: " + wit + "/100" +
                ", творчество: " + creativity + "/100";
    }
    public int sumProperties() {
        return intelligence + wisdom + wit + creativity;
    }

    public static void compare(Ravenclaw student1, Ravenclaw student2) {
        if (student1.sumProperties() > student2.sumProperties()) {
            System.out.println(student1.getName() + " лучший когтевранец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший когтевранец, чем " + student1.getName());
    }
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(byte intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(byte wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(byte wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(byte creativity) {
        this.creativity = creativity;
    }
}
