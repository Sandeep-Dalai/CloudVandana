//Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)
import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine().toLowerCase();

        if (isPangram(sentence)) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabetPresence = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabetPresence[ch - 'a'] = true;
            }
        }
        for (boolean present : alphabetPresence) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
