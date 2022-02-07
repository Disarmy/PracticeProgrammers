public class JumpTeleport {
    public int solution(int n) {
        int ans = 0;

        // 텔레포트할때는 건전지가 안듦 = 텔레포트를 최대한 많이해야함
        // n을 2로 나누면서 이동 = 텔레포트만 하면서 이동
        // 홀수일 경우 -1 = 점프
        while (n > 0){
            if(n%2 == 0){
                n /= 2;
            }
            else {
                ans++;
                n--;
            }
        }

        return ans;
    }
}
