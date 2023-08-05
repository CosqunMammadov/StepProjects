package happyFamily.readme3.animals;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {

    public String getNickname() {
        return null;
    }

    public int getTrickLevel() {
        return 0;
    }

    void eat() {
        System.out.println("I am eating.");
    }

    abstract void respond();
    
    @Override
    protected void finalize() {
        System.out.println("Object of Pet is deleted");
    }

}
