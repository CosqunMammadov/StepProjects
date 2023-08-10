package happyFamily.readme4;

import happyFamily.readme4.animals.Dog;
import happyFamily.readme4.animals.RoboCat;
import happyFamily.readme4.people.Family;
import happyFamily.readme4.people.Man;
import happyFamily.readme4.people.Woman;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        RoboCat cat = new RoboCat();
        Man father = new Man();
        Woman mother = new Woman();
        Man michael = new Man("Michael", "Karleone", 1977, 90);
        Family family = new Family(mother, father);

        michael.setFamily(family);
        family.setPet(new HashSet<>());
        family.getPet().add(dog);
        family.getPet().add(cat);
        michael.feedPet(true, dog);

        System.out.println(michael);
        System.out.println(family);
        System.out.println(dog);
        System.out.println(cat);


    }
}
