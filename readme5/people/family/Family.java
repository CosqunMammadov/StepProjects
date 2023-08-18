package happyFamily.readme5.people.family;

import happyFamily.readme5.animals.Pet;
import happyFamily.readme5.people.Human;
import happyFamily.readme5.people.HumanCreator;
import happyFamily.readme5.people.Man;
import happyFamily.readme5.people.Woman;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family implements HumanCreator {

    private Human mother;
    private Human father;
    private ArrayList<Human> children = new ArrayList<>();
    private List<Pet> pets;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, ArrayList<Human> children, List<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        pets = pet;
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

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public List<Pet> getPet() {
        return pets;
    }

    public void setPet(List<Pet> pets) {
        this.pets = pets;
    }

    public Human bornChild() {
        int gender = (int) (Math.random() * 2);
        String[] boyNames = {"Henry", "Lucas", "Benjamin"};
        String[] girlNames = {"Emma", "Sophia", "Evelyn"};
        int nameIndex = (int) (Math.random() * 3);
        int averageIq = (father.getIq() + mother.getIq()) / 2;
        if (gender == 0) {
            Man child = new Man();
            child.setName(boyNames[nameIndex]);
            child.setIq(averageIq);
            return child;
        } else if (gender == 1) {
            Woman child = new Woman();
            child.setName(girlNames[nameIndex]);
            child.setIq(averageIq);
            return child;
        }
        return null;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public String deleteChild(Human child) {
        children.remove(child);
        return "Child is deleted";
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public int countFamily() {
        int amountOfMembers = children.size();
        if (father != null)
            amountOfMembers++;
        if (mother != null)
            amountOfMembers++;
        return amountOfMembers;
    }

    protected void finalize() {
        System.out.println("Object of Family is deleted");
    }

    public boolean equals(Family family) {
        return
                this.hashCode() == family.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother.getName(), mother.getSurname(), father.getName(), father.getSurname());
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pets +
                '}';
    }
}
