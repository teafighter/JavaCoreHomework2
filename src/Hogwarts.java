import java.util.Random;

public class Hogwarts {

    private String name;
    private String lastname;
    private int magic;
    private int apparition;

    public Hogwarts(String name, String lastname) { // генератор NPC
        this.name = name;
        this.lastname = lastname;
        Random random = new Random();
        this.magic = random.nextInt(100);
        this.apparition = random.nextInt(100);
    }

    public Hogwarts(String name, String lastname, int magic, int apparition) {
        this.name = name;
        this.lastname = lastname;
        this.magic = magic;
        this.apparition = apparition;
    }
    public int sumBaseProperties() {
        return magic + apparition;
    }
    public static void compare(Hogwarts student1, Hogwarts student2) {
        String filler = " обладает бОльшей мощностью магии, чем ";
        if (student1.sumBaseProperties() > student2.sumBaseProperties()) {
            System.out.println(student1.getFullName() + filler + student2.getFullName());
        } else System.out.println(student2.getFullName() + filler + student1.getFullName());
    }
    public Hogwarts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    public String getFullName() {
        return name + " " + lastname;
    }
}
