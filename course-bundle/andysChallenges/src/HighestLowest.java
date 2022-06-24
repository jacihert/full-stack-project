import java.util.Arrays;

public class HighestLowest {
    private String numberSpacedInput;

    public HighestLowest(String numberSpacedInput) {
        this.numberSpacedInput = numberSpacedInput;
    }

    public static String highLow(String numberSpacedInput){
        String[] numberSpacedInputArray = numberSpacedInput.split(" ");
        System.out.println(Arrays.toString(numberSpacedInputArray));
        Arrays.stream(numberSpacedInputArray).sorted();
        return "to do";
    }

    @Override
    public String toString() {
        return "HighestLowest{" +
                "numberSpacedInput='" + numberSpacedInput + '\'' +
                '}';
    }
}
