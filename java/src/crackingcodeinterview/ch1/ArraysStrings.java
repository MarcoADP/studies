package crackingcodeinterview.ch1;

import java.util.List;

public class ArraysStrings {

    public static void main(String[] args) {

        verifyUniqueCharacters();

    }

    private static void verifyUniqueCharacters() {

        List<String> words = List.of("12345", "11", "", "123", "1233", "1234561");
        System.out.println("\nVerify if a word has unique characters using brute force O(n^2)");
        for (String word : words) {
            System.out.printf("%s => %s%n", word, VerifyUniqueCharacters.verifyBruteForce(word));
        }

        System.out.println("\nVerify if a word has unique characters using hash table O(n lg n)");
        for (String word : words) {
            System.out.printf("%s => %s%n", word, VerifyUniqueCharacters.verifyHashTable(word));
        }

        System.out.println("\nVerify if a word has unique characters using binary tree O(n lg n)");
        for (String word : words) {
            System.out.printf("%s => %s%n", word, VerifyUniqueCharacters.verifyBinaryTree(word));
        }
    }
}
