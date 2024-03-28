import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int numVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numVowels++;
            }
        }
        if (numVowels > 0) {
            System.out.println("The string contains " + numVowels + " vowels.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }
    }
}