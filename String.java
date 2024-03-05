import java.util.Scanner;

class StringClass {
    public static void main(String[] args) {
        String str = "Pema";
        String reversedString = "";

        System.out.print("Original word: ");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reversedString = ch + reversedString;
        }

        System.out.println("Reversed word: " + reversedString);

        int vowelCount = countVowels(str);
        System.out.println("Vowels in string: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
}
