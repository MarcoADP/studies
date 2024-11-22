package crackingcodeinterview.ch1;

public class StringRotation {

    private StringRotation() { }

    public static boolean isStringRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s1);

        return sb.toString().contains(s2);

    }

}
