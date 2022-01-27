import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] map = new int[n][n];

        //int[][] map 배열에 숫자넣어주기
        mapInArr(map, arr1, n);
        mapInArr(map, arr2, n);

        for(int i = 0; i < n; i++){
            StringBuilder bi = new StringBuilder();
            for(int j = 0; j < n; j++){
                //1보다 크다면 : 겹치는 것 포함
                if(map[i][j] > 0)
                    bi.append("#");
                else
                    bi.append(" ");
            }
            answer[i] = bi.toString();
        }

        return answer;
    }

    public void mapInArr(int[][] map, int[] arr, int n){
        for(int i = 0; i < arr.length; i++){
            StringBuilder bi = new StringBuilder();
            bi.append(Integer.toBinaryString(arr[i]));
            while (bi.length() < n){
                bi.insert(0, 0);
            }

            for(int j = 0; j < n; j++){
                map[i][j] += Character.getNumericValue(bi.charAt(j));
            }
        }
    }
}
