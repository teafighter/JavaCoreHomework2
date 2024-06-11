import java.util.Random;

public class Slytherin extends Hogwarts {

    // Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerHunger;

    public Slytherin(String name, String lastname) { // генератор NPC
        super(name, lastname);
        Random random = new Random();
        this.cunning = random.nextInt(100);
        this.determination = random.nextInt(100);
        this.ambition = random.nextInt(100);
        this.resourcefulness = random.nextInt(100);
        this.powerHunger = random.nextInt(100);
    }

    public Slytherin(String name, String lastname, int magic, int apparition, int cunning, int determination, int ambition, int resourcefulness, int powerHunger) {
        super(name, lastname, magic, apparition);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerHunger = powerHunger;
    }

    @Override
    public String toString() {
        return "Студент Слизерина " + super.getName() + " " + super.getLastname() +
                ", магическая сила: " + super.getMagic() + ", способность к трансгресии: " + super.getApparition() +
                ", хитрость: " + cunning + "/100" +
                ", решительность: " + determination + "/100" +
                ", амбициозность: " + ambition + "/100" +
                ", находчивость: " + resourcefulness + "/100" +
                ", жажда власти: " + powerHunger + "/100";
    }

    public int sumProperties() {
        return cunning + determination + ambition + resourcefulness + powerHunger;
    }

    public static void compare(Slytherin student1, Slytherin student2) {
        if (student1.sumProperties() > student2.sumProperties()) {
            System.out.println(student1.getName() + " лучший слизеринец, чем " + student2.getName());
        } else System.out.println(student2.getName() + " лучший слизеринец, чем " + student1.getName());
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(byte cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(byte determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(byte ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(byte resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerHunger() {
        return powerHunger;
    }

    public void setPowerHunger(byte powerHunger) {
        this.powerHunger = powerHunger;
    }
}
