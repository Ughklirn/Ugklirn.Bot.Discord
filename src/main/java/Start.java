import Animals.Cat;
import Animals.Habitat;
import Animals.Mammal;
import Animals.Whale;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Mammal cat = new Cat("Hauskatze", Habitat.Land);
        Mammal whale = new Whale("Weißwal", Habitat.Water);

        List<Mammal> mammals = new ArrayList<>();
        System.out.println(mammals.toString());
        mammals.add(cat);
        mammals.add(whale);
        System.out.println(mammals.toString());
    }
}
