package happyFamily.readme2;

public class Main {

    public static void main(String[] args) {
        Species dog = Species.DOG;
        Pet rock = new Pet(dog, "Rock", 5, 75, "eat", "drink", "sleep");
        Human father = new Human();
        Human mother = new Human();
        Human michael = new Human("Michael", "Karleone", 1977, 90, new String[][]{{DayofWeek.MONDAY.name(), "task"}, {DayofWeek.TUESDAY.name(), "task2"}});
        Family family = new Family(mother, father, new Human[]{michael}, rock);
        michael.setFamily(family);

        System.out.println(michael.toString());
        System.out.println(family.toString());
        System.out.println(rock.toString());
    }
}
