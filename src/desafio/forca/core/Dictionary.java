package desafio.forca.core;

import java.util.List;
import java.util.Random;

import desafio.forca.IO.Input;

public class Dictionary {

    private static final String FILE_PATH = "/desafio/forca/resources/dictionary.txt";
    private static final Dictionary INSTACE = new Dictionary();

    private final List<String> words; 
    private final Random random = new Random();

    private Dictionary() {
        words = Input.readLinesFromFile( FILE_PATH );
    }

    public Word nextWord() {
        return new Word( words.get(
            random.nextInt(
                0, words.size() ) ) );
    }

    public static Dictionary instace() {
        return INSTACE;
    }
}
