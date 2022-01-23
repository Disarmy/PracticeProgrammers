public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        //price마다
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            //이후로 얼마나 가격이 변화가 없었는지
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
