package happyFamily.readme2;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(Species species, String nickname, int age, int trickLevel, String... habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {

    }

    static {     //static initializer block
        System.out.println("Pet class is being loaded");
    }

    {   //instance initializer block
        System.out.println("Object of Pet is created");
    }


    void eat() {
        System.out.println("I am eating.");
    }

    void respond() {
        System.out.printf("Hello owner. I am %s. I miss you\n", nickname);
    }

    void foul() {
        System.out.println("I need to cover it up.");
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
    protected void finalize() {
        System.out.println("Object of Pet is deleted");
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                ", numberOfLegs=" + species.numberOfLegs +
                ", Does the animal have fur?: " + species.hasFur +
                ", Can the animal fly?: " + species.canFly +
                '}';
    }
}
