import java.util.Stack;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                st.push(answer);
                answer = 0;
            }
            else{
                answer = st.pop() + Math.max(2 * answer, 1);
            }
        }

        return answer;
    }
}
