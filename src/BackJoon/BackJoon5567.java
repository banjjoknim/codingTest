package BackJoon;

import java.util.*;

// 결혼식
// 16시 시작. 16시 45분 완료.
public class BackJoon5567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] relation = new int[m][2];
        Set<Integer> friends = new HashSet<>();
        Set<Integer> friendsTofriend = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();

            if (number1 == 1) {
                friends.add(number2);
                continue;
            }
            relation[i][0] = number1;
            relation[i][1] = number2;
        }

        for (int i = 0; i < m; i++) {
            int temp = relation[i][0];
            if (friends.contains(temp)) { // 친구의 친구
                friendsTofriend.add(relation[i][1]);
                continue;
            }

            temp = relation[i][1];
            if (friends.contains(temp)) { // 친구의 친구
                friendsTofriend.add(relation[i][0]);
            }
        }
        friends.addAll(friendsTofriend);
        System.out.println(friends.size());
    }
}
