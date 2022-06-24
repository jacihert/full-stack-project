import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LetterCounter {
    private ArrayList<String> wordSearch = new ArrayList<>();
    private String letter;

    public LetterCounter(ArrayList<String> wordSearch, String letter) {
        this.wordSearch = wordSearch;
        this.letter = letter;
    }


    public static int letterCounter(ArrayList<String> wordSearch, String letter) {
        return (int) wordSearch.stream().filter(alphabet->alphabet.contains(letter)).count();
//        return("hello");
    }
    //        Create a function that counts the number of times a particular letter shows up in the word search.
//        letterCounter([
//  ["D", "E", "Y", "H", "A", "D"],
//  ["C", "B", "Z", "Y", "J", "K"],
//  ["D", "B", "C", "A", "M", "N"],
//  ["F", "G", "G", "R", "S", "R"],
//  ["V", "X", "H", "A", "S", "S"]
//], "D") ➞ 3
//
//// "D" shows up 3 times: twice in the first row, once in the third row.
//
//        letterCounter([
//  ["D", "E", "Y", "H", "A", "D"],
//  ["C", "B", "Z", "Y", "J", "K"],
//  ["D", "B", "C", "A", "M", "N"],
//  ["F", "G", "G", "R", "S", "R"],
//  ["V", "X", "H", "A", "S", "S"]
//], "H") ➞ 2


    @Override
    public String toString() {
        return "LetterCounter{" +
                "wordSearch=" + wordSearch +
                ", letter='" + letter + '\'' +
                '}';
    }
}