package happyFamily.readme;

import java.util.Arrays;

public class Pet {

    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;


    public Pet(String species, String nickname, int age, int trickLevel, String... habits){
        this.species= species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }

    public Pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(){

    }



    void eat(){
        System.out.println("I am eating.");
    }



    void respond(){
        System.out.printf("Hello owner. I am %s. I miss you\n",nickname);
    }
    void foul(){
        System.out.println("I need to cover it up.");
    }


    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
