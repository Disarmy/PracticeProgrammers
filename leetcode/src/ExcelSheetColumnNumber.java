public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int answer = 0;

        int count = 0;
        for(int i = columnTitle.length() - 1; i >= 0; i--){
            answer += (columnTitle.charAt(i) - 64) * Math.pow(26, count++);
        }

        return answer;
    }
}
