package crackingcodeinterview.ch1;

public class OneWay {

    private OneWay() {
    }

    public static boolean isOneWayCheckTogether(String w1, String w2) {
        if (Math.abs(w2.length() - w1.length()) > 1 || w1.equals(w2)) {
            return false;
        }

        if (w2.length() < w1.length()) {
            String aux = w2;
            w2 = w1;
            w1 = aux;
        }

        boolean foundDifference = false;
        int offset = 0;
        for (int i = 0; i < w1.length(); i++) {
            int idxMin = i - offset;
            if (w1.charAt(idxMin) != w2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
                if (w1.length() != w2.length()) {
                    offset++;
                }
            }
        }

        return true;
    }

    public static boolean isOneWayCheckSeparate(String w1, String w2) {
        return isOneWayEdit(w1, w2) || isOneWayInsert(w1, w2);
    }

    private static boolean isOneWayInsert(String w1, String w2) {
        if (w1.length() == w2.length() || Math.abs(w2.length() - w1.length()) > 1) {
            return false;
        }

        if (w2.length() < w1.length()) {
            String aux = w2;
            w2 = w1;
            w1 = aux;
        }

        int wordBreaks = 0;
        for (int i = 0; i < w1.length(); i++) {
            int idxMin = i - wordBreaks;
            if (w1.charAt(idxMin) != w2.charAt(i)) {
                if (wordBreaks > 0) {
                    return false;
                }
                wordBreaks++;
            }
        }

        return true;
    }

    private static boolean isOneWayEdit(String w1, String w2) {
        if (w1.length() != w2.length() || w1.equals(w2)) {
            return false;
        }
        boolean differentChar = false;
        for (int i = 0; i < w2.length(); i++) {

            if (w1.charAt(i) != w2.charAt(i)) {
                if (differentChar) {
                    return false;
                }
                differentChar = true;
            }

        }
        return true;
    }
}
