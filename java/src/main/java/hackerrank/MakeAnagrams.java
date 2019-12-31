package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagrams {

    static int makeAnagram(String a, String b) {
        Map<String, Integer> aMap = new HashMap<>();
        Map<String, Integer> bMap = new HashMap<>();

        String[] aList = a.split("");
        String[] bList = b.split("");

        fillMap(aList, aMap);
        fillMap(bList, bMap);

        for (Map.Entry<String, Integer> entry: aMap.entrySet()) {
            if (bMap.containsKey(entry.getKey())) {

                Integer aValue = entry.getValue() - 1;
                if (aValue > -1) {
                    aMap.put(entry.getKey(), aValue);
                }

                Integer bValue = bMap.get(entry.getKey()) - 1;
                if (bValue > -1) {
                    bMap.put(entry.getKey(), bValue);
                }
            }
        }
        int aSum = 0;
        for (Map.Entry<String, Integer> item: aMap.entrySet()) {
            aSum += item.getValue();
        }
        int bSum = 0;
        for (Map.Entry<String, Integer> item2: bMap.entrySet()) {
            bSum += item2.getValue();
        }
        return aSum + bSum;
    }

    static void fillMap(String[] list, Map<String, Integer> map) {
        for(int i = 0; i < list.length; i++) {
            if (map.containsKey(list[i])) {
                Integer x = map.get(list[i]) + 1;
                map.replace(list[i], x);
            } else {
                map.put(list[i], 1);
            }
        }
    }
}
