//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
import java.util.Scanner;

public class StringCheck {

    // User-defined function to check if a string is null or empty (only whitespace)
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using the user-defined function
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }

        scanner.close();
    }
}
//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
import java.util.Scanner;

public class SubstringCounter {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward to continue searching
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get main string from user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Get substring to count
        System.out.print("Enter the substring to search for: ");
        String subString = scanner.nextLine();

        // Call user-defined function and display result
        int occurrences = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " times in the main string.");

        scanner.close();
    }
}
//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().
import java.util.Scanner;

public class StringReverser {

    // User-defined function to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse using user-defined function
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
import java.util.Scanner;

public class PalindromeChecker {

    // User-defined function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using user-defined function
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (ignoring case and punctuation).");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}

Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
import java.util.Scanner;

public class WhitespaceRemover {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }

        // Use regex to replace all whitespace characters (spaces, tabs, newlines, etc.)
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string with whitespaces: ");
        String input = scanner.nextLine();

        // Remove whitespace using user-defined function
        String result = removeWhitespace(input);
        System.out.println("String after removing whitespaces: " + result);

        scanner.close();
    }
}
//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
import java.util.Scanner;

public class WordCapitalizer {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+"); // Split by whitespace
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter and add to result
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call user-defined function
        String capitalized = capitalizeWords(input);
        System.out.println("Capitalized String: " + capitalized);

        scanner.close();
    }
}
//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
import java.util.Scanner;

public class StringTruncator {

    // User-defined function to truncate a string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }

        if (maxLength < 3) {
            return "...".substring(0, maxLength); // Handle very short lengths
        }

        if (str.length() <= maxLength) {
            return str;
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the maximum length: ");
        int maxLength = scanner.nextInt();

        // Use user-defined function
        String result = truncate(input, maxLength);
        System.out.println("Truncated String: " + result);

        scanner.close();
    }
}
//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
import java.util.Scanner;

public class NumericChecker {

    // User-defined function to check if the string is numeric
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Check each character
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using user-defined function
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does not contain only numeric characters.");
        }

        scanner.close();
    }
}
//Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // User-defined function to generate a random string
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        // Generate random characters
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get desired length from user
        System.out.print("Enter the desired length of the random string: ");
        int length = scanner.nextInt();

        // Generate and display random string
        String randomStr = generateRandomString(length);
        System.out.println("Generated Random String: " + randomStr);

        scanner.close();
    }
}
//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
import java.util.Scanner;

public class WordCounter {

    // User-defined function to count the number of words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string based on whitespace
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count words using user-defined function
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
