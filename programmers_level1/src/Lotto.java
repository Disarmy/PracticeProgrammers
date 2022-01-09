public class Lotto {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        //0이 전부 맞았을 때
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == 0 || lottos[i] == win_nums[j]){
                    count++;
                    break;
                }
            }
        }

        answer[0] = rank[count];
        count = 0;

        //0이 전부 틀렸을 때
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                    break;
                }
            }
        }
        answer[1] = rank[count];

        return answer;
    }
}
