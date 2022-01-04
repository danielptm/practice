package leetcode;

// https://leetcode.com/problems/complement-of-base-10-integer/
public class ComplementOfbase10 {

    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String binString = recurse(0, "", binary);
        int iNew = Integer.parseInt(binString, 2);
        return iNew;
    }

    public String recurse(int i, String acc, String binary) {
        if (i == (binary.length())) {
            return acc;
        }
        acc += binary.charAt(i) == '0' ? "1" : "0";
        return recurse(++i, acc, binary);
    }
}
