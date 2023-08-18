package happyFamily.readme5.people.family;

import happyFamily.readme5.animals.Pet;
import happyFamily.readme5.people.Human;

import java.util.List;

public class FamilyService extends CollectionFamilyDao {

    CollectionFamilyDao dB = new CollectionFamilyDao();

    public void displayAllFamilies() {
        System.out.println(dB.families);
    }

    public void getFamiliesBiggerThan(int memberSize) {
        for (int i = 0; i < dB.families.size(); i++) {
            if (dB.families.get(i).countFamily() > memberSize) {
                System.out.println(dB.families.get(i));
            }
        }
    }

    public void getFamiliesLessThan(int memberSize) {
        for (int i = 0; i < dB.families.size(); i++) {
            if (dB.families.get(i).countFamily() < memberSize) {
                System.out.println(dB.families.get(i));
            }
        }
    }

    public void createNewFamily(Human mother, Human father) {
        Family newFamily = new Family(mother, father);
        dB.saveFamily(newFamily);
    }

    public Family boornChild(Family family){
        Family renewedFamily = family;
        renewedFamily.addChild(renewedFamily.bornChild());
        dB.saveFamily(renewedFamily);
        return renewedFamily;
    }

    public Family adoptChild(Family family, Human human){
        Family renewedFamily = family;
        renewedFamily.addChild(human);
        dB.saveFamily(renewedFamily);
        return renewedFamily;
    }

    public void deleteAllChildrenOlderThen(int age){
        for (int i = 0; i < dB.families.size(); i++) {
            for (int j = 0; j < dB.families.get(i).getChildren().size(); j++) {
                if (dB.families.get(i).getChildren().get(j).getAge() > age) {
                    dB.families.get(i).deleteChild(dB.families.get(i).getChildren().get(j));
                }
            }
        }
    }

    public int count(){
        return dB.families.size();
    }

    public Family getFamilyById(int id){
        return dB.getFamilyByIndex(id);
    }

    public List getPets(int index){
        return dB.getFamilyByIndex(index).getPet();
    }

    public void addPet(int index, Pet pet){
        Family renewedFamily = dB.families.get(index);
        renewedFamily.addPet(pet);
        dB.saveFamily(renewedFamily);
    }
}
