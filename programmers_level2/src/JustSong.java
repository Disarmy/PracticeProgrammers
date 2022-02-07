import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JustSong {
    public String solution(String m, String[] musicinfos) throws ParseException {
        String answer = "";
        int time = 0;

        String[] sharp = {"C#", "D#", "E#", "F#", "G#", "A#"};
        String[] lower = {"c", "d", "e", "f", "g", "a"};

        for (String info : musicinfos) {
            String[] musicInfo = info.split(",");
            //시간체크
            SimpleDateFormat f = new SimpleDateFormat("HH:mm");
            Date d1 = f.parse(musicInfo[0]);
            Date d2 = f.parse(musicInfo[1]);

            long diff = d2.getTime() - d1.getTime();
            long min = diff / 60000;

            //c C# d D#변환
            for(int i = 0; i < sharp.length; ++i){
                m = m.replaceAll(sharp[i], lower[i]);
            }
            for(int i = 0; i < sharp.length; ++i){
                musicInfo[3] = musicInfo[3].replaceAll(sharp[i], lower[i]);
            }

            //시간크기대로 배열늘리기
            if (musicInfo[3].length() < min) {
                int multi = (int) (min / musicInfo[3].length());
                if((long) multi * musicInfo[3].length() < min){
                    multi++;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(musicInfo[3].repeat(Math.max(0, multi)));
                musicInfo[3] = sb.substring(0, (int) min);
            }
            //시간보다 배열이 더 크면
            else {
                musicInfo[3] = musicInfo[3].substring(0, (int) min);
            }

            //m을 포함하고있으면
            if (musicInfo[3].contains(m) && min > time) {
                answer = musicInfo[2];
                time = (int) min;
            }
        }

        if (answer.equals("")) {
            answer = "(None)";
        }

        return answer;
    }
}
