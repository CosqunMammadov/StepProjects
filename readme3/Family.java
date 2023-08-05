package happyFamily.readme3;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("Family class is being loaded");
    }

    {
        System.out.println("Object of Family is created");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
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

    public void setChildren(Human... children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human bornChild(){
        int gender = (int) (Math.random() * 2);
        String[] boyNames = {"Henry", "Lucas", "Benjamin"};
        String[] girlNames = {"Emma", "Sophia", "Evelyn"};
        int name = (int) (Math.random() * 3);
        if(gender == 0){
            Man child = new Man();
            child.setName(boyNames[name]);
            child.setIq((father.getIq() + mother.getIq()) / 2);
            return child;
        } else if (gender == 1) {
            Woman child = new Woman();
            child.setName(girlNames[name]);
            child.setIq((father.getIq() + mother.getIq()) / 2);
            return child;
        }
        return null;
    }

    public String addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        System.arraycopy(children, 0, newChildren, 0, children.length);
        newChildren[children.length] = child;
        children = newChildren;
        if (child.equals(children[children.length - 1])) {
            return "Child is added";
        } else
            return null;
    }

    public String deleteChild(Human child) {
        Human[] newChildren = new Human[children.length - 1];
        int k = 0;
        for (int i = 0; i < children.length; i++) {
            if (child.equals(children[i]))
                k++;
            else
                newChildren[i - k] = children[i];
        }
        children = newChildren;
        if (k == 1)
            return "Child is deleted";
        else
            return null;
    }

    public int countFamily(){
        int amountOfMembers = children.length;
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
                this.father.hashCode() == family.hashCode() &&
                        this.mother.hashCode() == family.mother.hashCode();
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
