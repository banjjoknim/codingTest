package programmers_level2;

import java.util.*;

// 파일명 정렬
// 09시 53분 시작. 10시 20분쯤 중지? 10시 40분 다시 시작. 12시 8분 완료.
// 처음에 substring으로 index찾아서 하려고 했다가 실패. 풀이 참조하였음.
public class SortFileNames {

    public static void main(String[] args) {
        SortFileNames sortFileNames = new SortFileNames();
        String[] files = new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        System.out.println(Arrays.toString(sortFileNames.solution(files)));
    }

    public String[] solution(String[] files) {

        Arrays.sort(files, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String head1 = s1.split("[1-9]")[0];
                String head2 = s2.split("[1-9]")[0];
//                String head1 = s1.split("[\\d]")[0];
//                String head2 = s2.split("[\\d]")[0];
                s1 = s1.replace(head1, "");
                s2 = s2.replace(head2, "");

                head1 = head1.toLowerCase();
                head2 = head2.toLowerCase();

//                 compareTo(x, y) => [ -1 : x < y | 0 : x == y | 1 : x > y ]
                int headCompareValue = head1.compareTo(head2);
                if (headCompareValue == 0) {

                    // head정렬 값이 같으므로 number로 정렬
                    String num1 = "";
                    for (char c : s1.toCharArray()) {
                        if (!(c >= '0' && c <= '9')) break;
                        num1 += c;
                    }
                    String num2 = "";
                    for (char c : s2.toCharArray()) {
                        if (!(c >= '0' && c <= '9')) break;
                        num2 += c;
                    }
                    return (Integer.parseInt(num1) - Integer.parseInt(num2));
                } else {
                    return headCompareValue;
                }
            }
        });

        return files;
    }

}
