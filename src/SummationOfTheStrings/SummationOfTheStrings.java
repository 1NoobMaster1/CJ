package SummationOfTheStrings;

import java.util.stream.Stream;

public class SummationOfTheStrings {
    public static void main(String[] args) {
        String str1 = "Ayan";
        String str2 = "Khan";
        int totalCharacters = Stream.of(str1, str2)
                .mapToInt(String::length).sum();
        System.out.println("Total number of characters: " + totalCharacters);
    }
}
