package BackJoon;

import java.util.Scanner;

// 대회 or 인턴
// 01시 25분 시작. 01시 33분 완료.
// 1. 여학생 2명 남학생 1명으로 구성된 최대 팀의 수 구하기
// 2. 여학생과 남학생의 비율 계산, 팀이 되지 못하는 수 구하기
// 3. 인턴십 참여하는 수에서 팀이 되지 못하는 학생만큼 빼기
// 4. 남은 인턴십 참여하는 수만큼 팀의 수 줄이기(3명당 1팀씩)
public class backJoon2875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int female = scanner.nextInt();
        int male = scanner.nextInt();
        int intern = scanner.nextInt();

        int teamCount = 0;
        int femaleDivision = female / 2;
        if (femaleDivision >= male) {
            teamCount = male;
        }
        if (femaleDivision < male) {
            teamCount = femaleDivision;
        }
        int totalPeople = female + male;
        int remainPeople = totalPeople - teamCount * 3;

        int remainIntern = intern - remainPeople;
        while (remainIntern > 0) {
            remainIntern = remainIntern - 3;
            teamCount--;
        }

        System.out.println(teamCount);
    }
}
