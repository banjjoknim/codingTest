package programmers_level2;

// 문자열 압축
// 16시 2분 시작.
public class StringCompression {
//    public int solution(String s) {
//
//        Set<String> stringSet = new HashSet<>();
//        int min = s.length();
////        System.out.println(stringSet);
//
//        for (int i = 1; i < s.length(); i++) {
//            cutString(s, i, stringSet);
//            int finalI = i;
//            stringSet = stringSet.stream()
//                    .filter(s1 -> s1.length() == finalI)
//                    .collect(Collectors.toSet());
//            System.out.println(stringSet);
//            Iterator<String> iterator = stringSet.iterator();
//            while (iterator.hasNext()) {
//                String regex = iterator.next();
//                String replaced = s.replaceAll(regex, "*");
////            System.out.println(replaced);
//                int count = 0;
//                for (int j = 0; j < replaced.length() - 1; j++) {
//                    if (replaced.charAt(j) == '*') {
//                        count++;
//                    }
//                }
//                int countLength = 0;
//                if (String.valueOf(count).length() != 1) {
//                    countLength = String.valueOf(count).length();
//                }
//                int length = replaced.length() - count + (count * regex.length()) - ((count - 1) * regex.length()) + countLength;
//                if (length < min) {
//                    min = length;
//                }
//            }
//            stringSet.clear();
//        }
//
//        return min;
//    }
//
//    private void cutString(String s, int size, Set set) {
//        for (int i = 0; i < s.length() - size; i++) {
//            set.add(s.substring(i, i + size));
//        }
//    }

    public int solution(String s) {
        int minLen = s.length();
        // unit 단위만큼 검사
        for(int unit = 1 ; unit <= s.length()/2 ; unit++) {
            // 검사할 문자의 범위 start ~ end
            int start = 0;
            int end = start + unit;
            int compressedLen = 0;
            int repeatedCnt = 1;

            // unit만큼 자른 첫 문자열
            String curWord = s.substring(start, end);
            String nextWord;

            start += unit;
            end += unit;

            // 문자열 끝까지 검사
            while(end <= s.length()) {
                nextWord = s.substring(start ,end);

                // next가 cur와 달라지게 될때, cur의 압축 길이를 compressedLen에 더한다.
                if(!curWord.equals(nextWord)) {

                    // 반복이 1 넘으면, 압축 수를 길이에 고려
                    if(repeatedCnt > 1) {
                        compressedLen +=  (int)(Math.log10(repeatedCnt)+1);
                    }
                    compressedLen += curWord.length();

                    repeatedCnt = 0;
                    curWord = nextWord;
                }

                repeatedCnt++;
                start += unit;
                end += unit;
            }

            // while문을 빠져나가며 고려되지 않은 남은 압축 길이 추가
            end -= unit;
            compressedLen += s.substring(end).length();

            // while문을 빠져나가며 고려되지 않은 마지막 압축 문자열 길이 추가
            if(repeatedCnt > 1) {
                compressedLen += (int)(Math.log10(repeatedCnt)+1);
            }
            compressedLen += curWord.length();

            if (  minLen > compressedLen) {
                minLen = compressedLen;
            }
        }

        return minLen;
    }

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.solution("abcabcabcabcdededededede"));
    }
}
