package OA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Problem: Process actions in a digital library system and return the section with the largest number of unique books.
Two types of actions:
visit sectionX: Navigate to the specified library section
add bookX: Add a book to the current section (duplicates ignored)

Example:
actions = ["visit sectionA", "add bookA", "add bookB", "add bookA",
           "visit sectionB", "visit sectionC", "add bookA", "add bookB", "add bookC"]
Output: "sectionC" (has 3 unique books)

 */
public class LibrarySystem {
    public static String solution(String[] actions) {
        // Map to store each section and its set o unique books
        Map<String, Set<String>> sections = new HashMap<>();
        String currentSection = "";

        for(String action : actions) {
            if(action.startsWith("visit ")) {
                // Extract section name from "visit sectionX"
                currentSection = action.substring(6);
                // Initialize section if it does not exist
                sections.putIfAbsent(currentSection, new HashSet<>());
            } else if(action.startsWith("add ")) {
                // Extract bookname from "add bookX"
                String bookName = action.substring(4);
                // Add book to current section
                if(!currentSection.isEmpty()) {
                    sections.get(currentSection).add(bookName);
                }
            }
        }

        // Find section with the largest number of unique books
        String largestSection = "";
        int maxBooks = -1;

        for(Map.Entry<String, Set<String>> entry : sections.entrySet()) {
            int bookCount = entry.getValue().size();
            if(bookCount > maxBooks) {
                maxBooks = bookCount;
                largestSection = entry.getKey();
            }
        }

        return largestSection;
    }
}