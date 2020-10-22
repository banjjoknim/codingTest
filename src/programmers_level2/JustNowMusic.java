package programmers_level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// 방금 그곡
// 14시 시작 16시 30분 완료.... 풀이 참조하여 풀었음.
// Music class 를 구현하여 해결하려 했으나 실패하였음.
public class JustNowMusic {
    public static void main(String[] args) throws ParseException {
        JustNowMusic justNowMusic = new JustNowMusic();
        String m = "ABCDEFG";
        String[] musicInfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String m2 = "ABC";
        String[] musicInfos2 = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String m3 = "CC#BCC#BCC#BCC#B";
        String[] musicInfos3 = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
        String m4 = "A#";
        String[] musicInfos4 = {"13:00,13:02,HAPPY,B#A#"};
        String m5 = "CCB";
        String[] musicInfos5 = {"03:00,03:10,FOO,CCB#CCB", "04:00,04:08,BAR,ABC"};
//        System.out.println(justNowMusic.solution(m, musicInfos));
//        System.out.println(justNowMusic.solution(m2, musicInfos2));
//        System.out.println(justNowMusic.solution(m3, musicInfos3));
        System.out.println(justNowMusic.solution(m4, musicInfos4));
//        System.out.println(justNowMusic.solution2(m4, musicInfos4));
//        System.out.println(justNowMusic.solution(m5, musicInfos5));
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse("12:00"));

    }

//        public String solution2(String m, String[] musicinfos) throws ParseException {
//        List<Music> answer = new ArrayList<>();
//        List<Music> musics = new ArrayList<>();
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//
//        int index = 0;
//        for (String s : musicinfos) {
//            String[] infos = s.split(",");
//            musics.add(new Music(sdf.parse(infos[0]), sdf.parse(infos[1]), infos[2], infos[3], index));
//            index = index + 1;
//        }
//        for (Music music : musics) {
//            Date start = music.start;
//            Date end = music.end;
//            long playTime = (end.getTime() - start.getTime()) / 1000 / 60;
//
//            List<String> sheet = new ArrayList<>();
//            for (int i = 0; i < music.musicSheet.length(); i++) {
//                if (music.musicSheet.charAt(i) == '#') {
//                    sheet.set(sheet.size() - 1, sheet.get(sheet.size() - 1) + "#");
//                    continue;
//                }
//                sheet.add(String.valueOf(music.musicSheet.charAt(i)));
//            }
//
//            String totalSheet = "";
//            for (int i = 0; i < playTime; i++) {
//                totalSheet += sheet.get(i % sheet.size());
//            }
//
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < totalSheet.length() - m.length(); i++) {
//                for (int j = i; j < i + m.replaceAll("\\#", "").length(); j++) {
//                    sb.append(sheet.get(j % sheet.size()));
//                }
//                if (sb.toString().equals(m)) {
//                    answer.add(music);
//                    break;
//                }
//                sb.setLength(0);
//            }
//
//        }
//
//        if (answer.isEmpty()) {
//            return "(None)";
//        }
//
//        Collections.sort(answer, new Comparator<Music>() {
//            @Override
//            public int compare(Music o1, Music o2) {
//                if (((o1.end.getTime() - o1.start.getTime()) - (o2.end.getTime() - o2.start.getTime())) == 0) {
//                    return o1.index - o2.index;
//                }
//                return -(int) ((o1.end.getTime() - o1.start.getTime()) - (o2.end.getTime() - o2.start.getTime()));
//            }
//        });
//
//        return answer.get(0).title;
//    }
//
//    class Music {
//        private final Date start; // 시작한 시각
//        private final Date end; // 끝난 시각
//        private final String title; // 음악 제목
//        private final String musicSheet; //악보 정보
//        private final int index;
//
//        public Music(Date start, Date end, String title, String musicSheet, int index) {
//            this.start = start;
//            this.end = end;
//            this.title = title;
//            this.musicSheet = musicSheet;
//            this.index = index;
//        }
//    }

    public String solution(String m, String[] musicinfos) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String answer = "(None)";
        int maxRunningTime = 0;

        for (String info : musicinfos) {
            String[] musicinfo = info.split(",");
            Date start = sdf.parse(musicinfo[0]);
            Date end = sdf.parse(musicinfo[1]);
            String musicName = musicinfo[2];

            int runningTime = getRunningTime(start, end);

            // 곡 정보를 재생해서 만든 악보
            String convertedCord = convertCord(musicinfo[3]);
            String convertedMelody = convertCord(m);
            String music = getSheet(runningTime, convertedCord);

            // 정보를 통해 만든 악보가 기억한 악보와 다르다면 제외
            if (!music.contains(convertedMelody)) {
                continue;
            }

            // 악보가 같은경우 재생시간이 긴 제목을 반환
            if (runningTime > maxRunningTime) {
                answer = musicName;
                maxRunningTime = runningTime;
            }
        }

        return answer;
    }

    // #이 붙은 음을 소문자로 치환
    private String convertCord(String m) {
        m = m.replaceAll("C#", "c");
        m = m.replaceAll("D#", "d");
        m = m.replaceAll("F#", "f");
        m = m.replaceAll("G#", "g");
        m = m.replaceAll("A#", "a");

        return m;
    }

    // 재생 시간만큼 재생해 악보를 만듬
    private String getSheet(int runningTime, String cords) {
        StringBuilder sheet = new StringBuilder();
        for (int i = 0; i < runningTime; i++) {
            sheet.append(cords.charAt(i % cords.length()));
        }

        return sheet.toString();
    }

    // 곡의 재생시간을 분으로 환산
    private int getRunningTime(Date start, Date end) {
        return (int) (end.getTime() - start.getTime()) / 1000 / 60;
    }

}
