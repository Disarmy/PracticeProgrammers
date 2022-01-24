public class StringBasic {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            s = s.replaceAll("[^\\d]", "");
            return s.length() == 4 || s.length() == 6;
        } else {
            return false;
        }
    }
}
