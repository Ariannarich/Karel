/* Arianna Richardson
October 20, 2019
This program finds the square root of a word and then prints the letter.
 */
import java.util.Scanner;
// Start of code
public class SquareWordRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.nextLine();
        int index = word.length();
        double sqrt = Math.sqrt(index); //Finds square root of the word's index
        // Adds .5 to round the root to round to the nearest whole number-
        double root = sqrt + .5;
       // -then casts the root to int to get the whole number
        int num = (int)root;
        // Converts root to letter
        String letter = word.substring(num , num + 1);
        // Prints the output
        System.out.println("The \"square root\" of " + word + " is " + letter);
        //End of code
    }
}
