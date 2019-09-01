package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Socks {

    public static int testSocks(int n, int[] ar) {
        Map<Integer, Integer> sockCounter = new HashMap<>();
        int numberOfMatches = 0;
        for(int i = 0; i < ar.length; i++) {
            Integer sock = ar[i];
            sockCounter.putIfAbsent(sock, 0);
            sockCounter.put(sock, sockCounter.get(sock) + 1);
        }
        Iterator itr = sockCounter.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, Integer> pair = (Map.Entry) itr.next();
            numberOfMatches += pair.getValue() / 2;
        }

        return numberOfMatches;
    }
}
