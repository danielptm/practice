package leetcode;

import java.math.BigInteger;

// https://leetcode.com/problems/add-binary/
public class AddBinary {


    //TODO: Do this
    public String addBinary(String a, String b) {
        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);

        String res = new BigInteger(b1.add(b2).toString(), 10).toString(2);


        return res;

    }
}
