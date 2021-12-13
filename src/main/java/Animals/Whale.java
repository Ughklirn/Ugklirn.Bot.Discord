package Animals;

public class Whale implements Mammal {
    private String race;
    private Habitat habitat;

    public Whale() {

    }

    public Whale(String race, Habitat habitat) {
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
        return "Whale{" +
                "race='" + race + '\'' +
                ", habitat=" + habitat +
                '}';
    }
}
