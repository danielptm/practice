package effective_java_practice.model.dictionary;

import java.util.Map;

public class SwedishDictionary extends Dictionary implements DictionaryInterface {

    public SwedishDictionary(Map<String, String> dictionary) {
        super(dictionary);
    }

    @Override
    public Map<String, String> getDictionary() {
        return this.dictionary;
    }
}

