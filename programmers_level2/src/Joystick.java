public class Joystick {
    public int solution(String name) {
        int answer = 0;
        //정방향 이동
        int minMove = name.length() - 1;

        for(int i = 0; i < name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            //A들로 이루어진 문자열발견시 뒤로가는게 이득일 수 있음
            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A'){
                next++;
            }

            minMove = Math.min(minMove, (i * 2) + name.length() - next);
            minMove = Math.min(minMove, (name.length() - next) * 2 + i);
        }

        return answer + minMove;
    }
}
