package controller;

import model.Dictionary;
@Controller
public class DictionaryController {
    private final Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
        // You can add some initial words to the dictionary here as a temporary solution
        dictionary.addWord("java", "A high-level, class-based, object-oriented programming language.");
        dictionary.addWord("algorithm", "A step-by-step procedure or formula for solving problems.");
        dictionary.addWord("variable", "A storage location identified by a memory address and an associated symbolic name.");
    }

    public String searchWord(String word) {
        return dictionary.searchWord(word);
    }
}

