package crackingcodeinterview.ch1;

public class StringCompression {

    private StringCompression() {
    }

    public static String compress(String string) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {

            count++;
            if (isEndString(string, i) || isNextCharDifferent(string, i)) {
                sb.append(string.charAt(i));
                sb.append(count);
                count = 0;
            }

        }

        return string.length() <= sb.length() ? string : sb.toString();

    }

    private static boolean isEndString(String string, int position) {
        return position + 1 >= string.length();
    }

    private static boolean isNextCharDifferent(String string, int position) {
        return string.charAt(position) != string.charAt(position + 1);
    }
}
