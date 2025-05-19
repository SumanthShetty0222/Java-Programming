//1. Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as follows

public class ListInterfaceDemo {
public static void main(String[] args) {
// Creating different types of Lists
List<String> arrayList = new ArrayList<>();
List<String> linkedList = new LinkedList<>();
System.out.println("=== ArrayList Demonstrations ===");
// 1. Adding elements
arrayList.add("Apple");
arrayList.add("Banana");
arrayList.add("Orange");
System.out.println("After adding elements: " + arrayList);
// 2. Adding element at specific index
arrayList.add(1, "Mango");
System.out.println("After adding Mango at index 1: " + arrayList);
// 3. Adding multiple elements
arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
System.out.println("After adding multiple elements: " + arrayList);
// 4. Accessing elements
String firstFruit = arrayList.get(0);
System.out.println("First fruit: " + firstFruit);
// 5. Updating elements
arrayList.set(1, "Kiwi");
System.out.println("After updating index 1 to Kiwi: " + arrayList);
// 6. Removing elements
arrayList.remove("Orange"); // Remove by object
arrayList.remove(0); // Remove by index
System.out.println("After removing elements: " + arrayList);
// 7. Searching elements
boolean containsKiwi = arrayList.contains("Kiwi");
int grapeIndex = arrayList.indexOf("Grape");
System.out.println("Contains Kiwi? " + containsKiwi);
System.out.println("Index of Grape: " + grapeIndex);
// 8. List size
System.out.println("List size: " + arrayList.size());

// 9. Iterating over list
System.out.println("\nIterating using for-each loop:");
for (String fruit : arrayList) {
System.out.println(fruit);
}
// 10. Using Iterator
System.out.println("\nIterating using Iterator:");
Iterator<String> iterator = arrayList.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
// 11. Sorting
Collections.sort(arrayList);
System.out.println("After sorting: " + arrayList);
// 12. Sublist
List<String> subList = arrayList.subList(0, 2);
System.out.println("Sublist (0-2): " + subList);
// 13. Clearing the list
arrayList.clear();
System.out.println("After clearing: " + arrayList);
// LinkedList specific operations
System.out.println("\n=== LinkedList Demonstrations ===");
LinkedList<String> fruits = new LinkedList<>();
fruits.addFirst("Apple");
fruits.addLast("Banana");
fruits.add("Orange");
System.out.println("LinkedList: " + fruits);
System.out.println("First element: " + fruits.getFirst());
System.out.println("Last element: " + fruits.getLast());
fruits.removeFirst();
fruits.removeLast();
System.out.println("After removing first and last: " + fruits);
}
}

//ArrayList
//1. Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not
import java.util.*;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Colors: " + colors);
        boolean hasRed = colors.contains("Red");
        System.out.println("Contains Red? " + hasRed);
    }
}


//2. Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
import java.util.*;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original list: " + colors);
        colors.remove(1);
        colors.remove("Blue"); 
        System.out.println("After removal: " + colors);
    }
}

//3. Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Collections.sort(colors);
        System.out.println("Sorted colors: " + colors);
    }
}

//4.Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.*;

public class ArrayListSubList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        List<String> subColors = colors.subList(0, 2); 
        System.out.println("Sublist (1st and 2nd elements): " + subColors);
    }
}

//5. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
import java.util.*;

public class ArrayListDeleteNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        int n = 2; 
        System.out.println("Before deletion: " + colors);
        if (n < colors.size()) {
            colors.remove(n);
        }
        System.out.println("After deleting element at index " + n + ": " + colors);
    }
}

//LinkedList 
//1. Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.*;

public class LinkedListIterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        ListIterator<String> iterator = colors.listIterator(1); 
        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//2.Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
import java.util.*;

public class LinkedListReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Iterator<String> reverseIterator = colors.descendingIterator();
        System.out.println("Iterating in reverse:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}

//3. Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
import java.util.*;

public class LinkedListInsertEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        colors.offerLast("Pink");
        System.out.println("After inserting at the end: " + colors);
    }
}

//4.Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
import java.util.*;

public class LinkedListDisplayWithIndex {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + ": " + colors.get(i));
        }
    }
}


//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
import java.util.*;

public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Before swap: " + colors);
        Collections.swap(colors, 0, 2); 
        System.out.println("After swap: " + colors);
    }
}
