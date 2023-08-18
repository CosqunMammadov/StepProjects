package happyFamily.readme5.people.family;

import happyFamily.readme5.people.Human;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class CollectionFamilyDao implements FamilyDao {

    // It's our database
    Family family;
    public static List<Family> families;

    @Override
    public List getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index > families.size()) {
            return null;
        } else return families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index > families.size())
            return false;
        else {
            families.remove(index);
            return true;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (families.contains(family)) {
            families.remove(family);
            return true;
        } else return false;
    }

    public boolean contains(Family family) {
        boolean b = false;
        for (int i = 0; i < families.size(); i++) {
            if (family.equals(families.get(i))) {
                b = true;
                break;
            } else b = false;
        }
        return b;
    }

    @Override
    public void saveFamily(Family family) {
        if (contains(family)) {
            int index = families.indexOf(family);
            families.remove(family);
            families.add(index, family);
        } else families.add(family);
    }


}
