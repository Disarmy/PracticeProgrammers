public class MaxMin {
    public String solution(String s) {
        String[] splitArr = s.split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String value : splitArr) {
            max = Math.max(max, Integer.parseInt(value));
            min = Math.min(min, Integer.parseInt(value));
        }

        return min + " " + max;
    }
}
