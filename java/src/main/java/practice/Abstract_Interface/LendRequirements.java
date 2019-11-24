package practice.Abstract_Interface;

import java.util.Map;

public interface LendRequirements {
    /**
     * Return a Map of the items required for lending out the lendable.
     * @return
     */
    Map<String, String> getRequirements();
}
