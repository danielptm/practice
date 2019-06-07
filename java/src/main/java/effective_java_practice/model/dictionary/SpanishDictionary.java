package effective_java_practice.model.dictionary;

import java.util.Map;

public class SpanishDictionary extends Dictionary implements DictionaryInterface {
    public SpanishDictionary(Map<String, String> dictionary) {
        super(dictionary);
    }
    @Override
    public Map<String, String> getDictionary() {
        return null;
    }
}
