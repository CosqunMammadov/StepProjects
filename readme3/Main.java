package happyFamily.readme3;

import happyFamily.readme3.animals.Fish;
import happyFamily.readme3.enums.DayofWeek;
import happyFamily.readme3.enums.Species;
import happyFamily.readme3.people.Family;
import happyFamily.readme3.people.Human;
import happyFamily.readme3.people.Man;
import happyFamily.readme3.people.Woman;

public class Main {

    public static void main(String[] args) {
        Species dog = Species.DOG;
        Fish rock = new Fish();
        Man father = new Man();
        Woman mother = new Woman();
        Man michael = new Man("Michael", "Karleone", 1977, 90, new String[][]{{DayofWeek.MONDAY.name(), "task"}, {DayofWeek.TUESDAY.name(), "task2"}});
        Family family = new Family(mother, father);
        michael.setFamily(family);
        System.out.println(michael.toString());
        System.out.println(family.toString());
        System.out.println(rock.toString());
        rock.respond();
    }
}
