package happyFamily.happyFamily2;

import java.util.Arrays;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String... habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this(species, nickname, 0, 0, (String) null);
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


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
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


    public boolean equals(Pet pet){
        return this.hashCode() == pet.hashCode();
    }
    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
