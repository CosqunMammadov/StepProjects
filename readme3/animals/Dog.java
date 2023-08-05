package happyFamily.readme3.animals;

import happyFamily.readme3.enums.Species;

import java.util.Arrays;
import java.util.Objects;

public class Dog extends Pet{
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

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

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
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

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    @Override
    public String toString() {
        return "DomesticCat{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}