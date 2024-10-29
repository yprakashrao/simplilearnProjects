package practice;

public class ReverseWordsInString {

    // Method to reverse the words in a given string
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces and split by spaces
        String[] words = s.trim().split("\\s+");
        
        StringBuilder reversedString = new StringBuilder();

        // Iterate through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            // Add a space between words except after the last word
            if (i != 0) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }

    // Main method to test the reverseWords function
    public static void main(String[] args) {
        String input = "  Hello World! This is a test.  ";
        String result = reverseWords(input);

        // Print the result
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Reversed Words: \"" + result + "\"");
    }
}
