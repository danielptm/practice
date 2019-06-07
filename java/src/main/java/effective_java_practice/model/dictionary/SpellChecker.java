package effective_java_practice.model.dictionary;

import java.util.function.Supplier;

public class SpellChecker {

    DictionaryInterface dictionary;

    public SpellChecker(DictionaryInterface dictionary) {
        this.dictionary = dictionary;
    }

    public SpellChecker(Supplier<? extends Dictionary> dictionary) {
        this.dictionary = (DictionaryInterface) dictionary.get();
    }

    public boolean isSpelledCorrect(String word) {
        return true;
    }
}
