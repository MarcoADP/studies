package crackingcodeinterview.ch1;

public class Palindrome {

    public static final int A_VALUE = Character.getNumericValue('a');
    public static final int Z_VALUE = Character.getNumericValue('z');

    private Palindrome() {
    }

    public static boolean isPermutationOfPalindromeBitVector(String phrase) {
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkOneBitSet(bitVector);
    }

    private static int createBitVector(String phrase) {
        int bitVector = 0;
        for (char c : phrase.toCharArray()) {
            int cValue = getCharNumber(c);
            bitVector = toggle(bitVector, cValue);
        }
        return bitVector;
    }

    private static int toggle(int bitVector, int value) {
        if (value < 0) {
            return bitVector;
        }

        int mask = 1 << value;
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }
        return bitVector;
    }

    private static boolean checkOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    public static boolean isPermutationOfPalindromeWithoutCheckingTable(String phrase) {
        int countOdd = 0;
        int[] table = new int[Z_VALUE - A_VALUE + 1];
        for (char c : phrase.toCharArray()) {
            int cValue = getCharNumber(c);
            if (cValue != -1) {
                table[cValue]++;
                if (table[cValue] % 2 != 0) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    public static boolean isPermutationOfPalindromeCheckingTable(String phrase) {

        int[] table = buildCharFrequency(phrase);
        return checkMaxOneOdd(table);
    }

    private static boolean checkMaxOneOdd(int[] table) {
        boolean oddFound = false;
        for (int i : table) {
            if (i % 2 != 0) {
                if (oddFound) {
                    return false;
                }
                oddFound = true;
            }
        }
        return true;
    }

    private static int[] buildCharFrequency(String phrase) {
        int[] table = new int[Z_VALUE - A_VALUE + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    private static int getCharNumber(char c) {
        int cValue = Character.getNumericValue(c);
        if (cValue >= A_VALUE && cValue <= Z_VALUE) {
            return cValue - A_VALUE;
        }
        return -1;
    }

}
