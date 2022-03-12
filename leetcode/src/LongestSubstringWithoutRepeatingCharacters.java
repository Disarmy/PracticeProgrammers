import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();

        int max = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            if (!hash.contains(s.charAt(right))) {
                hash.add(s.charAt(right));
                right++;
                max = Math.max(max, hash.size());
            } else {
                hash.remove(s.charAt(left));
                left++;
            }

            System.out.println(hash);
        }

        return max;
    }
}
