package happyFamily.readme4.animals;

import happyFamily.readme4.enums.Species;

import java.util.Set;

public class DomesticCat extends Pet {

    public DomesticCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public DomesticCat(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public DomesticCat() {
    }

    @Override
    public void respond() {
        System.out.printf("Helllo owner. I am %s. I miss you.\n", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }
}
