package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a PrefixMapSum class with the following methods:
 *
 * insert(key: str, value: int): Set a given key's value in the map. If the key already exists, overwrite the value.
 * sum(prefix: str): Return the sum of all values of keys that begin with a given prefix.
 *
 * Daniels notes:
 * 2 solutions are provided.
 * An easy brute force one and one that will be more performant with a lot of data.
 */
public class MapSum {

    private Map<String, Integer> easyMap = new HashMap<>();
    private ValueMap valueMap;

    public void easyInsert(String key, int val) {
        easyMap.put(key, val);
    }

    public int easySum(String pre) {
        int sum = 0;
        for (Map.Entry e: easyMap.entrySet()) {
            String key = (String) e.getKey();
            if (getMatchingPrefixLength(key, pre).equals(pre)) {
                sum += (int) e.getValue();
            }
        }
        return sum;
    }

    public void insert(String key, int val) {
        ValueMap nextValueMap = null;
        if (this.valueMap == null) {
            this.valueMap = new ValueMap(key.substring(0, 1), val);
        } else {
        }
        nextValueMap = this.valueMap;
        if (key.length() > 1) {
            for (int i = 2; i < (key.length() - 1); i++) {
                String thisPre = key.substring(0, i);
                if (!nextValueMap.getMap().containsKey(thisPre)) {
                    nextValueMap.getMap().put(thisPre, new ValueMap(thisPre, val));
                } else {
                    nextValueMap.getMap().get(thisPre).increment(val);
                }
                nextValueMap = nextValueMap.getMap().get(thisPre);
            }
        } else {
            return;
        }
        return;
    }
    public int sum(String pre) {
        return 0;
    }

    public Map<String, Integer> getEasyMap() {
        return easyMap;
    }

    String getMatchingPrefixLength(String key, String pre) {
        String result = key.substring(0, pre.length());
        return result;
    }
}

class ValueMap {

    private String key;
    private int sum = 0;
    private Map<String, ValueMap> map = new HashMap<>();

    public ValueMap(String key, int num) {
        this.key = key;
        this.sum += num;
    }

    public Map<String, ValueMap> getMap() {
        return map;
    }

    public void increment(int num) {
        this.sum+= num;
    }
}
