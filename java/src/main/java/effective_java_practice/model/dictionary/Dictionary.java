package effective_java_practice.model.dictionary;

import java.util.Map;

public abstract class Dictionary {
    Map<String, String> dictionary;
    protected Dictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }
}
