package leetcode;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        // get untouched most inner and outer and swap their locations.
        // Ex 'h':0 and 'o':4 -> o:0 and h:4
        int farRight = s.length - 1;
        int farLeft = 0;

        while ((farRight - farLeft) >= 1 ) {
            char left = s[farLeft];
            char right = s[farRight];
            s[farLeft] = right;
            s[farRight] = left;
            farRight = farRight - 1;
            farLeft = farLeft + 1;
        }
    }
}
