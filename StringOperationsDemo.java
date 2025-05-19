/*2 a. Develop a java program for performing various string operations with different string handling functions directed as follows String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()*/

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));
        System.out.println("Compare str1 and str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "Java programming is fun!";
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));
        System.out.println("Contains 'fun'? " + sentence.contains("fun"));

        // 5. Substring Operations
        System.out.println("Substring from index 5: " + sentence.substring(5));
        System.out.println("Substring from index 5 to 16: " + sentence.substring(5, 16));

        // 6. String Modification
        String modified = sentence.replace("fun", "awesome");
        System.out.println("After replace: " + modified);

        // 7. Whitespace Handling
        String withSpaces = "   Hello World!   ";
        System.out.println("Original with spaces: '" + withSpaces + "'");
        System.out.println("After trim: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String full = str1 + " " + str2;
        System.out.println("Concatenated using + : " + full);
        String concatMethod = str1.concat(" ").concat(str2);
        System.out.println("Concatenated using concat(): " + concatMethod);

        // 9. String Splitting
        String colors = "Red,Green,Blue,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("Splitted colors:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "is ");
        sb.replace(5, 8, "is very ");
        sb.delete(13, 17);
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Sumanth";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email
        String email = "student@example.com";
        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("student");
        System.out.println("Email: " + email);
        System.out.println("Valid email? " + isValid);
    }
}

//2b .2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.
public class StringPerformanceTest {
    public static void main(String[] args) {
        
        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            buffer.append("AIET");
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");

       
        StringBuilder builder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            builder.append("AIET");
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

      
        if (timeBuffer > timeBuilder) {
            System.out.println("\nStringBuilder is faster.");
        } else {
            System.out.println("\nStringBuffer is faster.");
        }
    }
}
