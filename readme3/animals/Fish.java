package happyFamily.readme3.animals;

import happyFamily.readme3.enums.Species;

import java.util.Arrays;
import java.util.Objects;

public class Fish extends Pet{

    public Fish(Species species, String nickname, int age, int trickLevel, String... habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Fish(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Fish() {
    }

    @Override
    public void respond() {
        System.out.printf("Helllo owner. I am %s. I miss you.\n", nickname);
    }
}
