import java.lang.reflect.Array;

import static java.lang.Integer.parseInt;

public class SimpleArithmeticOperations {
    private String stringinput1;
    private String stringinput2;
    private String operation;

    public SimpleArithmeticOperations(String stringinput1, String stringinput2, String operation) {
        this.stringinput1 = stringinput1;
        this.stringinput2 = stringinput2;
        this.operation = operation;
    }

    public static String calculate(String stringNumber1, String stringNumber2, String operation) {

        if (stringNumber1.equals("") || stringNumber2.equals("")) {
//            if (parseInt(stringNumber1).pa).equals("") || stringNumber2.equals("")) {
            System.out.println("Invalid Operation");
            return "";
        } else {

            switch (operation) {
                case "add":
                    return Integer.toString(parseInt(stringNumber1) + parseInt(stringNumber2));
                case "subtract":
                    return Integer.toString(parseInt(stringNumber1) - parseInt(stringNumber2));
                case "divide":
                    return Float.toString(Float.parseFloat(stringNumber1) / Float.parseFloat(stringNumber2));
                default:
                    return "unknown operation";
            }
        }
    }




    @Override
    public String toString() {
        return "SimpleArithmeticOperations{" +
                "stringinput1='" + stringinput1 + '\'' +
                ", stringinput2='" + stringinput2 + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
