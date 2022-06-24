import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



//    1. Create a function that counts the integer's number of digits. See examples below
//    count(4666) ➞ 4
//
//    count(544) ➞ 3
//
//    count(318) ➞ 3
//
//    count(-92563) ➞ 5
//
//    count(-314890) ➞ 6
//
//    count(654321) ➞ 6
//
//        System.out.println("Enter the number for which, the number digits are to be counts");
        Scanner myScanner = new Scanner(System.in);
//        int inputNumberDigitsToCount = myScanner.nextInt();
//            int numberOfDigits = (Integer.toString(inputNumberDigitsToCount)).length();
//            System.out.println("The number of digits is " + numberOfDigits);
//        System.out.println("----------------------------------------------------------------------------------");






//            2. Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers. HINT: You might want to use the "Modulus %" operator for determining odd or even
//    warOfNumbers([2, 8, 7, 5]) ➞ 2
//// 2 + 8 = 10
//// 7 + 5 = 12
//// 12 is larger than 10
//// So we return 12 - 10 = 2
//
//    warOfNumbers([12, 90, 75]) ➞ 27

        // completed already





//            3. Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
//    arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
//
//    arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
//
//    arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]

//
//        System.out.println(Multiples.createArrayOfMultiples(7,5));
//        System.out.println( Multiples.createArrayOfMultiples(12,10));
//        System.out.println( Multiples.createArrayOfMultiples(17,6));
//
//        System.out.println("----------------------------------------------------------------------------------");

//            4. Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:
//            "Player 1 wins"
//            "Player 2 wins"
//            "TIE" (if both inputs are the same)
//    rps("rock", "paper") ➞ "Player 2 wins"
//
//    rps("paper", "rock") ➞ "Player 1 wins"
//
//    rps("paper", "scissors") ➞ "Player 2 wins"
//
//        System.out.println(RockPaperScissors.rps("rock","paper"));
//        System.out.println(RockPaperScissors.rps("paper","rock"));
//        System.out.println(RockPaperScissors.rps("paper","scissors"));
//        System.out.println("----------------------------------------------------------------------------------");

//
//
//
//        System.out.println("----------------------------------------------------------------------------------");


//            5. (HARD) Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers where each number appears exactly once.
//    cons([5, 1, 4, 3, 2]) ➞ true
//// Can be re-arranged to form [1, 2, 3, 4, 5]
//
//    cons([5, 1, 4, 3, 2, 8]) ➞ false
//
//    cons([5, 6, 7, 8, 9, 9]) ➞ false
//// 9 appears twice


//            TO DO


//        System.out.println("----------------------------------------------------------------------------------");


//            6. Create a function which validates whether a given array alternates between positive and negative numbers.
//            alternateSign([3, -2, 5, -5, 2, -8]) ➞ true
//
//    alternateSign([-6, 1, -1, 4, -3]) ➞ true
//
//    alternateSign([4, 4, -2, 3, -6, 10]) ➞ false

//            TO DO

//        System.out.println("----------------------------------------------------------------------------------");

//        Create a function that takes two number strings and returns their sum as a string.
//                add("111", "111") ➞ "222"
//
//        add("10", "80") ➞ "90"
//
//        add("", "20") ➞ "Invalid Operation"

//        System.out.println(SumOf2Strings.add("111","111"));
//        System.out.println(SumOf2Strings.add("","20"));;
//        System.out.println("----------------------------------------------------------------------------------");


//        Challenge Two
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

//        System.out.println(LetterCounter.letterCounter({"A", "B"},"B"));
        //            TO DO
//   //        System.out.println("----------------------------------------------------------------------------------");


//        Challenge Three
//        Write a function that returns the first n vowels of a string.
//        firstNVowels("sharpening skills", 3) ➞ "aei"
//
//        firstNVowels("major league", 5) ➞ "aoeau"
//
//        firstNVowels("hostess", 5) ➞ "invalid"

        //            TO DO
///        System.out.println("----------------------------------------------------------------------------------");

//        Challenge Four
//        Write a function that returns true if there exists at least one number that is larger than or equal to n.
//        existsHigher([5, 3, 15, 22, 4], 10) ➞ true
//
//        existsHigher([1, 2, 3, 4, 5], 8) ➞ false
//
//        existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
//
//        existsHigher([], 5) ➞ false
//
//
////            TO DO
////        System.out.println("----------------------------------------------------------------------------------");
//
//
//        Challenge FIve
//        Write a function that does the following for the given values: add, subtract, divide and multiply.
//        These are simply referred to as the basic arithmetic operations.
//        The variables have to be defined, but in this challenge they will be defined for you.
//        All you have to do is check the variables, do some string to integer conversions, use some if conditions, and apply the arithmetic operation.
//        operation("1",  "2",  "add" ) ➞ 3
//
//        operation("4",  "5",  "subtract") ➞ -1
//
//        operation("6",  "3",  "divide") ➞ 2
//
//        System.out.println(SimpleArithmeticOperations.calculate("3","2","add"));
//        System.out.println(SimpleArithmeticOperations.calculate("4","5","subtract"));
//        System.out.println(SimpleArithmeticOperations.calculate("6","3","divide"));
//        System.out.println("----------------------------------------------------------------------------------");

//
//        Challenge One
//        Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:
//        If the length of the string is less than two, return "Incompatible.".
//                If the first and last characters are the same, return "Two's a pair.".
//                flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
//
//        flipEndChars("ada") ➞ "Two's a pair."
//
//        flipEndChars("Ada") ➞ "adA"
//
//        flipEndChars("z") ➞ "Incompatible."
        System.out.println(Flip.flipEndChars("ada"));
        System.out.println(Flip.flipEndChars("z"));
        System.out.println(Flip.flipEndChars("Ada"));
        System.out.println("----------------------------------------------------------------------------------");
//        Challenge Two
//        Create a method that accepts a string of space separated numbers and
//        returns the highest and lowest number (as a string).
//        highLow("1 2 3 4 5") ➞ "5 1"
//
//        highLow("1 2 -3 4 5") ➞ "5 -3"
//
//        highLow("1 9 3 4 -5") ➞ "9 -5"
//
//        highLow("13") ➞ "13 13"

        System.out.println(HighestLowest.highLow("1 2 3 4 5"));
        System.out.println(HighestLowest.highLow("1 2 -3 4 5"));
        System.out.println(HighestLowest.highLow("1 9 3 4 -5"));
        System.out.println(HighestLowest.highLow("13"));


//             System.out.println("----------------------------------------------------------------------------------");
//        Challenge Three
//        Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
//                missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
//
//        missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
//
//        missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7

//        System.out.println("----------------------------------------------------------------------------------");


        }

    }

