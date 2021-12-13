package Animals;

public class Cat implements Mammal {
    private String race;
    private Habitat habitat;

    public Cat() {

    }

    public Cat(String race, Habitat habitat) {
        this.race = race;
        this.habitat = habitat;
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String getRace() {
        return this.race;
    }

    @Override
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public Habitat getHabitat() {
        return this.habitat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "race='" + race + '\'' +
                ", habitat=" + habitat +
                '}';
    }
}
