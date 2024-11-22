package crackingcodeinterview.ch1;

import tuple.Tuple;

import java.util.ArrayList;
import java.util.List;

public class ArraysStrings {

    public static final String ANSWER_FORMAT = "%s => %s%n";

    public static void main(String[] args) {

        //verifyUniqueCharacters();
        //verifyStringsPermutation();
        //urlify();
        //checkPermutationPalindrome();
        //checkOneWay();
        //compressString();
        //zeroMatrix();
        stringRotation();
    }

    private static void stringRotation() {
        List<Tuple<String, String>> tupleList = new ArrayList<>();
        tupleList.add(new Tuple<>("123456", "456123"));
        tupleList.add(new Tuple<>("123456", "561234"));
        tupleList.add(new Tuple<>("123456", "561233"));

        for (Tuple<String, String> tuple : tupleList) {
            String w1 = tuple.getFirst();
            String w2 = tuple.getSecond();
            System.out.printf(ANSWER_FORMAT, String.format("%s-%s", w1, w2), StringRotation.isStringRotation(w1, w2));
        }
    }

    private static void zeroMatrix() {

        int[][] matrix = new int[][] {{1, 2, 3, 9, 1}, {4, 5, 6, 0, 2}, {0, 7, 8, 9, 3}, {1, 2, 3, 4, 5}};
        ZeroMatrix.printMatrix(matrix);
        int[][] result = ZeroMatrix.zeroMatrix(matrix);
        ZeroMatrix.printMatrix(result);

        matrix = new int[][] {{1, 2, 3, 9, 1}, {4, 5, 6, 0, 2}, {0, 7, 8, 9, 3}, {1, 2, 3, 4, 5}};
        ZeroMatrix.printMatrix(matrix);
        result = ZeroMatrix.zeroMatrixWithoutAux(matrix);
        ZeroMatrix.printMatrix(result);
    }

    private static void compressString() {
        List<String> words = List.of("aabcccccaaa", "a", "ab", "aa", "aaa", "aabb", "aabbc", "aabbbcc");
        //List<String> words = List.of("aabcccccaaa");
        System.out.println("\nCompress string");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, StringCompression.compress(word));
        }
    }

    private static void checkOneWay() {
        List<Tuple<String, String>> tupleList = new ArrayList<>();
        tupleList.add(new Tuple<>("pale", "ple"));
        tupleList.add(new Tuple<>("ple", "pale"));
        tupleList.add(new Tuple<>("ple", "ple"));
        tupleList.add(new Tuple<>("pale", "pele"));
        tupleList.add(new Tuple<>("pale", "pela"));
        tupleList.add(new Tuple<>("pales", "pale"));
        tupleList.add(new Tuple<>("pale", "bale"));
        tupleList.add(new Tuple<>("pale", "bae"));

        System.out.println("\nCheck one way in separate steps");
        for (Tuple<String, String> tuple : tupleList) {
            String w1 = tuple.getFirst();
            String w2 = tuple.getSecond();
            System.out.printf(ANSWER_FORMAT, String.format("%s-%s", w1, w2), OneWay.isOneWayCheckSeparate(w1, w2));
        }

        System.out.println("\nCheck one way in one step");
        for (Tuple<String, String> tuple : tupleList) {
            String w1 = tuple.getFirst();
            String w2 = tuple.getSecond();
            System.out.printf(ANSWER_FORMAT, String.format("%s-%s", w1, w2), OneWay.isOneWayCheckTogether(w1, w2));
        }
    }

    private static void checkPermutationPalindrome() {
        List<String> words = List.of("Tact Coa", "Cevce", "abcab", "abca", "abcaa");
        System.out.println("\nCheck if it's a permutation of a palindrome checking table");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, Palindrome.isPermutationOfPalindromeCheckingTable(word));
        }

        System.out.println("\nCheck if it's a permutation of a palindrome without checking table");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, Palindrome.isPermutationOfPalindromeWithoutCheckingTable(word));
        }

        System.out.println("\nCheck if it's a permutation of a palindrome with bit vector");
        for (String word : words) {
            System.out.printf(ANSWER_FORMAT, word, Palindrome.isPermutationOfPalindromeBitVector(word));
        }
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
