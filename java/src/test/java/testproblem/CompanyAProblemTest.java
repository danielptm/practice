package testproblem;

import interview_questions.ACompanyProblem;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CompanyAProblemTest {

    @Test
    public void testProblem() {

        int truckSpace1 = 110;
        int[] packageSpaces = new int[]{20,70,90,30,60,110};

        int truckSpace2 = 250;
        int[] packageSpace2 = new int[]{100, 180, 40, 120, 10};

        ArrayList<Integer> packageSpaces1 = new ArrayList<>(packageSpaces.length);

        ArrayList<Integer> packageSpaces2 = new ArrayList<>();

        for(int i = 0; i < packageSpaces.length; i++){
            packageSpaces1.add(packageSpaces[i]);
        }

        for(int i = 0; i < packageSpace2.length; i++){
            packageSpaces2.add(packageSpace2[i]);
        }

        List<Integer> items = ACompanyProblem.IDsOfPackages(truckSpace1, packageSpaces1);

        List<Integer> items2 = ACompanyProblem.IDsOfPackages(truckSpace2, packageSpaces2);


        Assert.assertEquals(0, items.get(0).intValue());
        Assert.assertEquals(4, items.get(1).intValue());

//        Assert.assertEquals(1, items2.get(0).intValue());
//        Assert.assertEquals(2, items2.get(1).intValue());


    }
}
