import java.util.ArrayList;
import java.util.List;

public class Cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new ArrayList<>();

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }

        if (cacheSize == 0)
            return cities.length * 5;

        for (String city : cities) {
            if (!cache.contains(city)) {
                if (cache.size() < cacheSize) {
                    cache.add(city);
                } else {
                    cache.remove(0);
                    cache.add(city);
                }
                //cache miss
                answer += 5;
            } else {
                cache.remove(city);
                cache.add(city);
                //cache hit
                answer += 1;
            }
        }

        return answer;
    }
}
