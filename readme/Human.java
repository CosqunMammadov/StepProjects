package happyFamily.readme;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int year;
    int iq;

    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;


    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {
    }

    void greetPet(){
        System.out.printf("Hello, %s\n", pet.nickname);
    }
    void describePet(){
        if (pet.trickLevel>=50)
            System.out.printf("I have a %s, he is %s years old, he is vey sly \n", pet.species, pet.age);
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly \n", pet.species, pet.age);
    }

    public boolean feedPet(boolean isTime){
        if (isTime){
            System.out.printf("Hm... I will feed %s \n", pet.nickname);
            return true;
        }else {
            int a = (int) (Math.random()*100);
            if (pet.trickLevel > a) {
                System.out.printf("Hm... I will feed %s \n", pet.nickname);
                return true;
            }else {
                System.out.printf("I think %s is not hungry. \n", pet.nickname);
                return false;
            }

        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother.name +
                ", father=" + father.name +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }
}
