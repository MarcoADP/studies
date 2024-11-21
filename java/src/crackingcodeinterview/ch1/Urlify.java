package crackingcodeinterview.ch1;

public class Urlify {

    private Urlify() { }

    public static String urlifyStringBuilder(char[] charArray, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {

            char c = charArray[i];
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String urlifyCharArray(char[] charArray, int length) {

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (charArray[i] == ' ') {
                spaceCount++;
            }
        }

        int index = length + spaceCount * 2;
        if (length < index) {
            charArray[length] = '\0';
        }

        for (int i = length - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                charArray[index - 1] = '0';
                charArray[index - 2] = '2';
                charArray[index - 3] = '%';
                index -= 3;
            } else {
                charArray[index - 1] = charArray[i];
                index--;
            }
        }

        return String.valueOf(charArray);
    }

}
