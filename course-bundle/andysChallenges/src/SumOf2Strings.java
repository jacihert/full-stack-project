import static java.lang.Integer.parseInt;

public class SumOf2Strings {

    private String stringNumber1;
    private String stringNumber2;

    public SumOf2Strings(String stringNumber1, String stringNumber2) {
        this.stringNumber1 = stringNumber1;
        this.stringNumber2 = stringNumber2;
    }

public static String add(String stringNumber1, String stringNumber2){
        if (stringNumber1.equals("") || stringNumber2.equals("") ) {
            System.out.println("Invalid Operation");
            return "";
        } else {
//            System.out.println(Integer.toString(parseInt(stringNumber1) + parseInt(stringNumber2)));
            return Integer.toString(parseInt(stringNumber1) + parseInt(stringNumber2));
        }
    }

    @Override
    public String toString() {
        return "SumOf2Strings{" +
                "stringNumber1='" + stringNumber1 + '\'' +
                ", stringNumber2='" + stringNumber2 + '\'' +
                '}';
    }
}
