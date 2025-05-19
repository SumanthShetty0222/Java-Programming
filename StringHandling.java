/*3a Develop a java program for performing various string operations with different string handling functions directed as follows: String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()*/

import java.util.*;

public class StringHandling {
    public static void main(String[] args) {
       
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

       
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));
        System.out.println("Compare str1 to str2: " + str1.compareTo(str2));

        
        String sentence = "Java programming is interesting.";
        System.out.println("Sentence: " + sentence);
        System.out.println("Contains 'Java'? " + sentence.contains("Java"));
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));

       
        System.out.println("Substring from index 5: " + sentence.substring(5));
        System.out.println("Substring from 5 to 16: " + sentence.substring(5, 16));

        // 6. String Modification
        String modified = sentence.replace("interesting", "fun");
        System.out.println("Modified sentence: " + modified);

       
        String withSpaces = "   AIET Campus   ";
        System.out.println("Original: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        
        String full1 = str1 + " " + str2;
        String full2 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated using +: " + full1);
        System.out.println("Concatenated using concat(): " + full2);

       
        String fruits = "Apple,Banana,Orange,Mango";
        String[] fruitArray = fruits.split(",");
        System.out.println("Splitted Fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

       
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "is ");
        sb.replace(5, 8, "is very ");
        sb.delete(13, 18);
        System.out.println("StringBuilder Output: " + sb.toString());

        
        String name = "Sumanth";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        
        String email = "student@aiet.edu";
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");
        System.out.println("Email: " + email);
        System.out.println("Valid Email? " + isValid);
    }
}

//3b.String Exercise
//Q1.Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
public class IsNullOrEmpty {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String input = "   ";
        System.out.println("Is Null or Empty? " + isNullOrEmpty(input));
    }
}


//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
public class CountOccurrences {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("abababab", "ab"));
    }
}

//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().
public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("OpenAI"));
    }
}


//Q4.Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}

//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
public class RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespace("A I E T Campus"));
    }
}


//3b String Exercise
//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
public class CapitalizeWords {
    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("welcome to aiet mangalore"));
    }
}

//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
public class Truncate {
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        System.out.println(truncate("This is a long sentence", 10));
    }
}


//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
public class IsNumeric {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("12345"));
    }
}

//Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
import java.security.SecureRandom;

public class GenerateRandomString {
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateRandomString(10));
    }
}


//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
