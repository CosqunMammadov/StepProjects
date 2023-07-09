package happyFamily.happyFamily1;

public class Main {

    public static void main(String[] args) {

        Pet dog= new Pet();
        dog.nickname= "Rock";
        dog.age= 5;
        dog.trickLevel= 75;
        dog.habits= new String[]{"eat", "drink", "sleep"};
        dog.species="dog";

        Human michael= new Human();
        michael.name= "Michael";
        michael.surname= "Karleone";
        michael.year= 1977;
        michael.iq= 90;
        michael.pet= dog;

        Human father= new Human();
        father.name= "Vito";
        father.surname= "Karleone";

        Human mother= new Human();
        mother.name= "Jane";
        mother.surname= "Karleone";

        michael.father= father;
        michael.mother= mother;


        System.out.println(dog.toString());
        System.out.println(michael.toString());
    }
}
