package happyFamily.readme5.people.family;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface FamilyDao {

    public List getAllFamilies ();
    public Family getFamilyByIndex(int index);
    public boolean deleteFamily(int index);
    public boolean deleteFamily (Family family);
    public void saveFamily (Family family);

}
