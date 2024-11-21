package crackingcodeinterview.ch1;

import java.util.List;

public class ArraysStrings {

    public static final String ANSWER_FORMAT = "%s => %s%n";

    public static void main(String[] args) {

        //verifyUniqueCharacters();
        //verifyStringsPermutation();
        urlify();
    }

    private static void urlify() {
        String word = "Mr John Smith    ";
        int length = 13;
        System.out.println("\nUrlify with StringBuilder");
        System.out.printf(ANSWER_FORMAT, word, Urlify.urlifyStringBuilder(word.toCharArray(), length));

        System.out.println("\nUrlify with CharArray");
        System.out.printf(ANSWER_FORMAT, word, Urlify.urlifyCharArray(word.toCharArray(), length));

    }

    private static void verifyStringsPermutation() {

        String target = "abcd";
        List<String> words = List.of("abc", "abcd", "dbca", "abcde", "", "bccda", "dBCa", "abce");
        System.out.println("\nVerify if a string is a permutation by sorting them");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, StringsPermutation.verifySortingStrings(target, word));
        }

        System.out.println("\nVerify if a string is a permutation of other using a counter array");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, StringsPermutation.verifyUsingArrays(target, word));
        }


    }

    private static void verifyUniqueCharacters() {

        List<String> words = List.of("12345", "11", "", "123", "1233", "1234561");
        System.out.println("\nVerify if a word has unique characters using brute force O(n^2)");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, VerifyUniqueCharacters.verifyBruteForce(word));
        }

        System.out.println("\nVerify if a word has unique characters using hash table O(n lg n)");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, VerifyUniqueCharacters.verifyHashTable(word));
        }

        System.out.println("\nVerify if a word has unique characters using binary tree O(n lg n)");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, VerifyUniqueCharacters.verifyBinaryTree(word));
        }
    }
}
