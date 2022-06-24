import java.util.ArrayList;

public class Multiples {
    int numberToCreateMultiples;
    int length ;


    public Multiples(int numberToCreateMultiples, int length) {
        this.numberToCreateMultiples = numberToCreateMultiples;
        this.length = length;
    }

    public static ArrayList<Integer> createArrayOfMultiples(int numberToCreateMultiples, int length){
        ArrayList<Integer> arrayOfMultiples = new ArrayList<>();

        for (int i = 1; i <= length; i++) {
            arrayOfMultiples.add(numberToCreateMultiples*i);
        }

//        System.out.println(arrayOfMultiples);
        return arrayOfMultiples;
    }



}
