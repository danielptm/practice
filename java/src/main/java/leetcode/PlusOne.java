package leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        String num = "";
        for (int i = 0; i < digits.length; i++) {
            num += String.valueOf(digits[i]);
        }
        BigInteger bigN = new BigInteger(num);
        bigN = bigN.add(new BigInteger("1"));
        String newS = bigN.toString();
        int[] newArr = Arrays.stream(newS.split(""))
                .mapToInt(i -> Integer.valueOf(i)).toArray();
        return newArr;
    }
}
