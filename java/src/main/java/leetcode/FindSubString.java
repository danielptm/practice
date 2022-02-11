package leetcode;

public class FindSubString {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle) || needle.equals("")) {
            return 0;
        }
        int res = -1;
        try {
            int nlLength = needle.length();
            int hsLength = haystack.length();

            char firstC = needle.charAt(0);


            for (int i = 0; i < hsLength; i++) {
                char c = haystack.charAt(i);
                if (c == firstC) {
                    int ssLength = i + nlLength;
                    String ss = haystack.substring(i, ssLength);
                    if (ss.equals(needle)) {
                        res = i;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            return -1;
        }
        return res;
    }
}
