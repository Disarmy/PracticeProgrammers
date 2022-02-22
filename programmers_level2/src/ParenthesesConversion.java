import java.util.Stack;

public class ParenthesesConversion {
    public String solution(String p) {
        //입력이 빈 문자열일 경우 빈 문자열을 반환합니다
        if(p.length() == 0){
            return "";
        }
        //이미 올바른 문자열일 경우 그대로 반환
        else if(isCorrect(p)){
            return p;
        }

        return separation(p);
    }

    public String separation(String p){
        //문자열 w를 균형잡힌 문자열 u, v로 분리합니다
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();

        int left = 0;
        int right = 0;
        boolean vOrder = false;
        for(int i = 0; i < p.length(); i++){
            char c = p.charAt(i);

            //u를 나눔
            if(left == right && left != 0 && !vOrder){
                vOrder = true;
            }

            if(!vOrder){
                if(c == '(') left++;
                else if(c == ')') right++;
                u.append(c);
            }
            else{
                v.append(c);
            }
        }

        if(isCorrect(u.toString())){
            if(v.length() != 0){
                u.append(separation(v.toString()));
            }
        }
        //새로운 문자열 만들기
        else{
            StringBuilder s = new StringBuilder();
            //빈 문자열에 '('를 붙입니다
            s.append('(');
            //문자열 v를 재귀수행한 결과를 이어붙입니다
            s.append(separation(v.toString()));
            //'('를 붙입니다
            s.append(')');
            //u의 첫번째와 마지막 문자를 제거하고 나머지 문자열의 괄호방향을 뒤집어서 붙입니다
            u.deleteCharAt(0);
            u.deleteCharAt(u.length() - 1);

            for(int i = 0; i < u.length(); i++){
                if(u.charAt(i) == '('){
                    u.setCharAt(i, ')');
                }
                else{
                    u.setCharAt(i, '(');
                }
            }
            s.append(u);

            return s.toString();
        }

        return u.toString();
    }

    public boolean isCorrect(String p){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == ')') {
                if (stack.isEmpty()) return false;

                if (stack.peek() == '(')
                    stack.pop();
            } else stack.push(p.charAt(i));
        }

        return stack.isEmpty();
    }
}
