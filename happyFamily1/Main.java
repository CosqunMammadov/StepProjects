package happyFamily.happyFamily1;

public class Main {

    public static void main(String[] args) {


        Pet dog = new Pet("dog", "Rock", 5, 75, "eat", "drink", "sleep");

        Human michaelFather = new Human("Vito", "Karleone", 1957);

        Human michaelMother = new Human("Jane", "Karleone", 1959);

        Human michael = new Human("Michael", "Karleone", 1977, 90, dog, michaelMother, michaelFather, new String[][] {{"day1","task1"},{"day2","task2"}});



        Pet cat = new Pet("cat", "Tom");

        Human jakeFather = new Human("Jone", "Miller", 1973);

        Human jakeMother = new Human("Sophia", "Miller", 1975);

        Human jake = new Human("Jake", "Miller", 1994, jakeMother, jakeFather);



        Pet fish = new Pet();

        Human emmaFather = new Human();

        Human emmaMother = new Human();

        Human emma= new Human();


        System.out.println(michael.toString());
        System.out.println(dog.toString());
    }
}
