package happyFamily.readme4.animals;

import happyFamily.readme4.enums.Species;

import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    protected Species species;
    protected String nickname;
    protected int age;
    protected int trickLevel;
    protected Set<String> habits;

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

    public Set getHabits() {
        return habits;
    }

    public void setHabits(Set habits) {
        this.habits = habits;
    }

    void eat() {
        System.out.println("I am eating.");
    }

    abstract void respond();
    
    @Override
    protected void finalize() {
        System.out.println("Object of Pet is deleted");
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Objects.hash(habits);
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
                ", habits=" + habits.toString() +
                '}';
    }
}
