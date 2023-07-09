package happyFamily.happyFamily1;

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


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.name + " " +mother.surname +
                ", father=" + father.name + " " +father.surname +
                ", pet=" + pet +
                '}';
    }
}
