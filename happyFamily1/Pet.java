package happyFamily.happyFamily1;

import java.util.Arrays;

public class Pet {

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species= species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }
    public Pet(String species, String nickname){
        this(species,nickname,0,0,null);
    }
    public Pet(){

    }


    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    void eat(){
        System.out.println("I am eating.");
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

    void respond(){
        System.out.printf("Hello owner. I am %s. I miss you\n",nickname);
    }
    void foul(){
        System.out.println("I need to cover it up.");
    }
}
