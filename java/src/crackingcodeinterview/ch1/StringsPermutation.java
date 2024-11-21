package crackingcodeinterview.ch1;

import java.util.Arrays;

public class StringsPermutation {

    private static String sort(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public static boolean verifySortingStrings(String target, String string) {

        if (target.length() != string.length()) {
            return false;
        }

        String targetSorted = sort(target.toLowerCase());
        String stringSorted = sort(string.toLowerCase());

        return targetSorted.equals(stringSorted);
    }

    public static boolean verifyUsingArrays(String target, String string) {

        if (target.length() != string.length()) {
            return false;
        }

        int[] lettersCounter = new int[128];
        target = target.toLowerCase();
        for (char c : target.toCharArray()) {
            lettersCounter[c]++;
        }

        string = string.toLowerCase();
        for (char c : string.toCharArray()) {
            lettersCounter[c]--;
            if (lettersCounter[c] < 0) {
                return false;
            }
        }
        return true;
    }

}
