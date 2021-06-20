package programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 압축
// 시간 측정이 의미 없는 듯..
// 풀이 참조해서 풀었음...
public class Compression {
    public int[] solution1(String msg) {

        //인덱스 초기 셋팅
        ArrayList<String> index = new ArrayList<>(Arrays.asList(
                new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
                        "T", "U", "V"
                        , "W", "X", "Y", "Z"}));

        //길이가 하나라면, 인덱스에서 해당 위치를 찾아서 반환
        if (msg.length() == 1) {

            int i = index.indexOf(msg);

            return new int[]{i + 1};
        }

        //결과를 담을 리스트. 사이즈가 가변이기 때문에 리스트로 선언
        ArrayList<Integer> ans = new ArrayList<>();

        int idx = 1;//분기문마다 검사를 진행할 위치

        String w = "" + msg.charAt(0);

        while (idx <= msg.length()) {

            if (idx == msg.length()) {//더이상 찾을 단어가 없을 때,

                ans.add(index.indexOf(w) + 1);//현재 w의 인덱스를 결과 리스트에 추가하고 분기문 종료
                break;
            }

            char c = msg.charAt(idx);//c에는 현재 검사를할 위치에 해당하는 단어를 넣어준다.

            String wc = w + c;

            if (index.contains(wc)) {//wc가 인덱스에 포함하고 있다면,

                w = wc;//현재 wc와 다음 c를 합쳐줘야하기 때문에 w에 넣어준다.
                idx++;//다음 단어 위치를 정해주고, 다음 분기문으로 간다.
                continue;
            }

            index.add(wc);//wc를 포함하고 있지 않기 때문에 새롭게 인덱스에 추가해준다.
            ans.add(index.indexOf(w) + 1);//결과 리스트에 새롭게 추가해준 인덱스 번호를 추가한다.

            w = "" + c;//인덱스를 추가했으므로, w는 현재 c로 다시 셋팅한다.
            idx++;//다음 위치로 선정하고, 다음 분기문으로 간다.

        }

        //결과 리스트를 포맷에 맞게 결과 배열로 만들고 반환
        int[] answer = new int[ans.size()];

        for (int i = 0; i < answer.length; i++)
            answer[i] = ans.get(i);

        return answer;
    }

    public int[] solution2(String msg) {
        // 1. 알파벳을 순서대로<알파벳, 번호> 형태로 해시맵에 저장한다.
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            words.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        List<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            // 2. 입력된 문자열을 첫번째 문자부터 해시맵에 키값과 일치하는지 확인한다.
            // 3. 해시맵에 키값이 존재하면 문자의 길이를 더늘리고 2번으로 돌아가고,일치하지 않는다면 해시맵에 새로 저장하고
            //    다음 문자열로 2번 과정을 반복한다.새로 저장될 때,길이를 늘리기 이전의 문자의 value를 반환해야할 배열에 저장한다.
            sb.append(msg.charAt(i));
            if (!words.containsKey(sb.toString())) {
                words.put(sb.toString(), words.size() + 1);
                sb.setLength(sb.length() - 1);
                answer.add(words.get(sb.toString()));
                sb.setLength(0);
                i = i - 1; //  i를 하나 줄여서 마지막으로 저장했던 값부터 다시 체크할 수 있도록 해준다!
            }
        }
        // 4. 2 ~ 3의 과정으로 문자열의 끝까지 탐색을 마쳤다면 마지막에 탐색한 문자열은 해시맵에 이미 존재하는 값이기 때문에 배열에 출력값이 저장되지 않는다.
        // 따라서,마지막으로 탐색한 문자열의 value를 추가로 반환해야할 배열에 저장한다.
        if (sb.length() > 0) {
            answer.add(words.get(sb.toString()));
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        Compression compression = new Compression();
        System.out.println(Arrays.toString(compression.solution1("KAKAO")));
    }
}
