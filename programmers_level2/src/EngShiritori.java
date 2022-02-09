import java.util.ArrayList;
import java.util.List;

public class EngShiritori {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int index = 0;
        List<String> wordList = new ArrayList<>();

        char lastLetter = 0;
        for (String word : words) {
            if (!wordList.isEmpty()) {
                if (word.charAt(0) == lastLetter && !wordList.contains(word)) {
                    wordList.add(word);
                    lastLetter = word.charAt(word.length() - 1);
                    index++;
                } else {
                    break;
                }
            } else {
                wordList.add(word);
                lastLetter = word.charAt(word.length() - 1);
                index++;
            }
        }

        if (index != words.length) {
            answer[0] = index % n + 1;
            answer[1] = index / n + 1;
        }

        return answer;
    }
}
