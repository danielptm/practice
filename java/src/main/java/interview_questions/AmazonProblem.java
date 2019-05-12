package interview_questions;

import java.util.ArrayList;
import java.util.List;

class Package {
    boolean pickedUp;
    int id;
    int spaceUnits;

    public Package(int id, int spaceUnits) {
        this.spaceUnits = spaceUnits;
        this.pickedUp = false;
        this.id = id;
    }

    public boolean isPickedUp() {
        return pickedUp;
    }

    public void setPickedUp(boolean pickedUp) {
        this.pickedUp = pickedUp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpaceUnits() {
        return spaceUnits;
    }

    public void setSpaceUnits(int spaceUnits) {
        this.spaceUnits = spaceUnits;
    }
}

public class AmazonProblem {


    /**
     *
     * Given truck space units and a list of product space units, find exactly 2 products that will fit in the truck space.
     * 30 truck space units are reserved (not filled) for safety reasons. Each product has an id 0 - (n-1).
     *
     * @param truckSpace the number of space as units available in the truck.
     * @param packagesSpace a collection of space units. Each item in this collection represents the number of sapce units occupied by a package.
     * @return a list of ids of the packages that are chosen to fit in the truck.
     */
    public static ArrayList<Integer> IDsOfPackages(int truckSpace,
                                     ArrayList<Integer> packagesSpace)
    {
        int actualTruckSpace = truckSpace - 30;
        ArrayList<Integer> idsOfChosenPackages = new ArrayList<>(2);

        //Create exception handling here if packagespace is not valid.
        List<Package> packages = new ArrayList<>(packagesSpace.size());

        for (int i = 0; i < packagesSpace.size(); i++) {
            // Didnt think about how package is a reserved word. So therefore the wrong spelling.
            Package packag = new Package(i, packagesSpace.get(i));
            packages.add(packag);
        }

        for(int i = 0; i < packages.size(); i++) {
            for(int j = 0; j < packages.size(); j++) {
                int spaceTakenByPackages = packages.get(i).getSpaceUnits() + packages.get(j).getSpaceUnits();
                if (spaceTakenByPackages == actualTruckSpace) {
                    if(idsOfChosenPackages.size() == 0) {
                        idsOfChosenPackages.add(packages.get(i).getId());
                        idsOfChosenPackages.add(packages.get(j).getId());
                    }
                }
            }
        }

        return idsOfChosenPackages;
    }

}
