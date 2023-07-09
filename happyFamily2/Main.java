package happyFamily.happyFamily2;

public class Main {
    enum testEnum{
        XL, XXL
    }
    public static void main(String[] args) {

        Pet dog= new Pet("dog","Rock",5,75, "eat", "drink", "sleep");

        Human father= new Human();
        father.name= "Vito";
        father.surname= "Karleone";

        Human mother= new Human();
        mother.name= "Jane";
        mother.surname= "Karleone";



        Human michael= new Human("Michael","Karleone", 1977, 90);
        michael.schedule= new String[][]{{"day", "task"}, {"day2", "task2"}};




        System.out.println(dog.toString());
        System.out.println(michael.toString());
    }
}
