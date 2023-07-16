package happyFamily.readme1;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("dog", "Rock", 5, 75, "eat", "drink", "sleep");

        Human father = new Human();

        Human mother = new Human();

        Human michael = new Human("Michael", "Karleone", 1977, 90, new String[][]{{"day", "task"}, {"day2", "task2"}});

        Family family = new Family(mother, father, new Human[]{michael}, dog);
        michael.setFamily(family);

        System.out.println(michael.toString());
        System.out.println(family.toString());

    }
}
