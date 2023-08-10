package happyFamily.readme3.animals;

import happyFamily.readme3.enums.Species;

import java.util.Arrays;
import java.util.Objects;

public class Dog extends Pet{

    public Dog(Species species, String nickname, int age, int trickLevel, String... habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Dog(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Dog() {
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public void respond() {
        System.out.printf("Helllo owner. I am %s. I miss you.\n", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }
}
