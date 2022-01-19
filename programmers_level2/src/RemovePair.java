import java.util.Stack;

public class RemovePair {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //스택의 top이 현재 알파벳과 같으면 pop
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            //다르면 push
            else {
                stack.push(s.charAt(i));
            }
        }

        //성공하면 1 실패하면 0 리턴
        return stack.isEmpty() ? 1 : 0;
    }
}
