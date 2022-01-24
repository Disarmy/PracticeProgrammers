import java.util.HashMap;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = clothes.length;

        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        if (map.size() > 1) {
            int count = 1;

            //key를 돌면서 곱해줌
            for (String key : map.keySet()) {
                count *= map.get(key) + 1;
            }

            answer = count - 1;
        }

        return answer;
    }
}
