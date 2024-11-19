package crackingcodeinterview.ch1;

import binarytree.AVLTree;
import hashtable.HashTable;

public class VerifyUniqueCharacters {

    public static boolean verifyBruteForce(String word) {

        int length = word.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean verifyHashTable(String word) {

        HashTable<String, Integer> hashTable = new HashTable<>(100);
        int length = word.length();
        for (int i = 0; i < length; i++) {
            String character = String.valueOf(word.charAt(i));
            if (hashTable.get(character) != null) {
                return false;
            }
            hashTable.put(String.valueOf(word.charAt(i)), 1);
        }

        return true;
    }

    public static boolean verifyBinaryTree(String word) {

        AVLTree tree = new AVLTree();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            int c = word.charAt(i);
            if (tree.search(c)) {
                return false;
            }
            tree.insert(c);
        }

        return true;
    }

}
