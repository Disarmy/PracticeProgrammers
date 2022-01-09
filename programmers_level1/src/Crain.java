import java.util.ArrayList;
import java.util.List;

public class Crain {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();

        for(int i = 0; i < moves.length ; i++){
            int move = moves[i] - 1;
            for(int j = 0; j < board[move].length ; j++) {
                if (board[j][move] != 0) {
                    stack.add(board[j][move]);
                    board[j][move] = 0;

                    if(stack.size() >= 2){
                        if(stack.get(stack.size() - 1) == stack.get(stack.size() - 2)){
                            answer += 2;
                            stack.remove(stack.size() - 1);
                            stack.remove((stack.size() - 1));
                        }
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
