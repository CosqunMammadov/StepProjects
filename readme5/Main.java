package happyFamily.readme5;

import happyFamily.readme5.animals.Dog;
import happyFamily.readme5.animals.Fish;
import happyFamily.readme5.animals.RoboCat;
import happyFamily.readme5.people.family.CollectionFamilyDao;
import happyFamily.readme5.people.family.Family;
import happyFamily.readme5.people.Man;
import happyFamily.readme5.people.Woman;
import happyFamily.readme5.people.family.FamilyService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        RoboCat cat = new RoboCat();
        Man father = new Man("Arthur", "Karleone");
        Woman mother = new Woman("Elizabeth", "Karleone");
        Man michael = new Man("Michael", "Karleone", 21, 90);
        Family family = new Family(mother, father);
        michael.setFamily(family);
        family.addChild(michael);

        Fish fish = new Fish();
        Man father1 = new Man("Joseph", "Wiliam");
        Woman mother1 = new Woman("Jenifer", "Wiliam");
        Woman emma = new Woman("Emma", "Wiliam", 7, 110);
        Family family1 = new Family(mother1, father1);
        emma.setFamily(family1);
        family1.addChild(emma);

        CollectionFamilyDao dB = new CollectionFamilyDao();
        dB.families = new ArrayList<>();
        dB.families.add(family);
        dB.families.add(family1);

        family.setPet(new ArrayList<>());
        family.getPet().add(dog);
        dB.saveFamily(family);
//        System.out.println(dB.families);

        FamilyService familyService = new FamilyService();
        familyService.getFamiliesBiggerThan(2);
        familyService.getFamiliesLessThan(3);

        familyService.createNewFamily(new Woman(), new Man());

    }
}
