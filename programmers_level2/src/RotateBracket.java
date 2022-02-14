import java.util.Stack;

public class RotateBracket {
    public int solution(String s) {
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            answer += isCorrect(s) ? 1 : 0;
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    public boolean isCorrect(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            }
            else{
                switch (s.charAt(i)){
                    case '}':
                        if(stack.peek() == '{') stack.pop(); break;
                    case ']':
                        if(stack.peek() == '[') stack.pop(); break;
                    case ')':
                        if(stack.peek() == '(') stack.pop(); break;
                    default: stack.push(s.charAt(i));
                }
            }
        }

        return stack.isEmpty();
    }
}
