public class NotEnoughMoney {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;

        //놀이기구 총 이용 금액
        for(int i = 1; i <= count ; i++){
            totalPrice += price * i;
        }

        return totalPrice > money ? totalPrice -= money : 0;
    }
}
