import java.util.Arrays;

public class StringDesc {
    public String solution(String s) {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);

        StringBuilder sb = new StringBuilder(String.valueOf(sChar));

        return sb.reverse().toString();
    }
}
