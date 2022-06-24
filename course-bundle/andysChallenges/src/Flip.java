import java.lang.reflect.Array;

public class Flip {

    private String inputString;

    public Flip(String inputString) {
        this.inputString = inputString;
    }

    public static String flipEndChars(String inputString) {
        String firstLetter = inputString.substring(0,1) ;
        String lastLetter = inputString.substring(inputString.length()-1);

        if (inputString.length()<2) return "Incompatible";
        else if (firstLetter.equals(lastLetter))  return "Two's a pair";
        else return lastLetter+inputString.substring(1,inputString.length()-1)+firstLetter;
    }

    @Override
    public String toString() {
        return "Flip{" +
                "inputString='" + inputString + '\'' +
                '}';
    }
}
