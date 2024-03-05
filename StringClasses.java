import java.util.Scanner;

class StringClasses {
    public static void main(String[] args) {
        String text = "My name is pema Rinchen";
        String wordToFind = "Java";
        String palindromeString = "pema";
        int occurrences = findOccurrences(text, wordToFind);
        System.out.println("The word \"" + wordToFind + "\" occurs " + occurrences + " times in the given text.");
        System.out.println("Is the string \"" + palindromeString + "\" a palindrome? " + isPalindrome(palindromeString));
    }
    public static int findOccurrences(String text, String wordToFind) {
        int occurrences = 0;
        int index = text.indexOf(wordToFind);

        while (index != -1) {
            occurrences++;
            index = text.indexOf(wordToFind, index + 1);
        }

        return occurrences;
    }
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
