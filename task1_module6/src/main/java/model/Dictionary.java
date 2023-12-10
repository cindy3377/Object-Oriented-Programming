package model;

import java.util.HashMap;

public class Dictionary {
    private final HashMap<String, String> wordMap;

    public Dictionary() {
        this.wordMap = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        wordMap.put(word.toLowerCase(), meaning);
    }

    public String searchWord(String word) {
        return wordMap.getOrDefault(word.toLowerCase(), "Word not found in the dictionary.");
    }
}

