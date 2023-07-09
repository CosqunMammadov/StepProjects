package happyFamily.happyFamily2;

import java.util.ArrayList;
import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

public Family(Human mother, Human father){
    this.mother=mother;
    this.father=father;
}

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family() {
    }

    public void addChild(Human child){
        ArrayList<Human> arrayList= new ArrayList<>(Arrays.asList(children));
        arrayList.add(child);
        children= arrayList.toArray(children);
    }

    public void deleteChild(Human child){
    ArrayList<Human> arrayList= new ArrayList<>(Arrays.asList(children));
    arrayList.remove(child);
    children= arrayList.toArray(children);
    }

    public int countFamily(){
    return 2+children.length;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
