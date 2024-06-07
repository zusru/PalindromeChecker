import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();
        word = word.toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0, j = word.length() -1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome == true) {
            System.out.print("The word is a palindrome");
        }

        else {
            System.out.print("The word is not a palindrome");
        }

    }
}