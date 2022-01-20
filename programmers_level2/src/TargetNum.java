public class TargetNum {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int count, int sum) {
        if (count >= numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        int total = 0;
        //+의 경우
        total += dfs(numbers, target, count + 1, sum + numbers[count]);
        //-의 경우
        total += dfs(numbers, target, count + 1, sum - numbers[count]);

        return total;
    }
}
