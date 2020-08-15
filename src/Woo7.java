import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class People implements Comparable<People> {
	String name;
	int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(People people) {
		if (this.score < people.getScore()) {
			return -1;
		} else if (this.score > people.getScore()) {
			return 1;
		}

		return 0;
	}
}

public class Woo7 {

	//23시 50분 시작. 01시 46분 완료.
	//1. 친구관계인가?
	//2. 같이 아는 친구인가? 10점
	//3. 방문은 몇 번 했는가? 1점
	//점수 높은 순서대로 최대 5명까지 출력.
	//추천할 친구가 없다면 출력x, 친구관계는 중복되지 않는다.

	public String[] solution(String user, String[][] friends, String[] visitors) {
		String[] answer = {};

		List<String> peopleList = new ArrayList<String>();
		List<String> friendList = new ArrayList<String>();
		List<String> togetherKnow = new ArrayList<String>();
		List<Integer> scoreList = new ArrayList<Integer>();
		List<People> recommendList = new ArrayList<People>();

		for (int i = 0; i < friends.length; i++) {
			if (!friends[i][0].equals(user) && !friends[i][1].equals(user)) {
				if (!peopleList.contains(friends[i][0])) {
					peopleList.add(friends[i][0]);
				}
				if (!peopleList.contains(friends[i][1])) {
					peopleList.add(friends[i][1]);
				}
			}

			if (friends[i][0].equals(user) || friends[i][1].equals(user)) {
				if (friends[i][0].equals(user)) {
					friendList.add(friends[i][1]);
				} else {
					friendList.add(friends[i][0]);
				}
			}
		}

		for (int i = 0; i < visitors.length; i++) {
			if (!peopleList.contains(visitors[i])) {
				peopleList.add(visitors[i]);
			}
		}

		for (int i = 0; i < peopleList.size(); i++) {
			for (int j = 0; j < friendList.size(); j++) {
				if (peopleList.get(i).equals(friendList.get(j))) {
					peopleList.remove(i);
				}
			}
		}

		for (int i = 0; i < friends.length; i++) {
			for (int j = 0; j < friendList.size(); j++) {
				if (friends[i][0].equals(friendList.get(j)) && !friends[i][1].equals(user)) {
					togetherKnow.add(friends[i][1]);
				}
				if (friends[i][1].equals(friendList.get(j)) && !friends[i][0].equals(user)) {
					togetherKnow.add(friends[i][0]);
				}
			}
		}

		for (int i = 0; i < peopleList.size(); i++) {
			int knowCount = 0;
			int visitCount = 0;
			for (int j = 0; j < togetherKnow.size(); j++) {
				if (peopleList.get(i).equals(togetherKnow.get(j))) {
					knowCount = knowCount + 1;
				}
			}

			for (int k = 0; k < visitors.length; k++) {
				if (peopleList.get(i).equals(visitors[k])) {
					visitCount = visitCount + 1;
				}
			}
			scoreList.add(10 * knowCount + 1 * visitCount);
		}

		for (int i = 0; i < peopleList.size(); i++) {
			People p = new People();
			p.name = peopleList.get(i);
			p.score = scoreList.get(i);
			recommendList.add(p);
		}

		Collections.sort(recommendList, Comparator.reverseOrder());

		if (recommendList.size() < 5) {
			answer = new String[recommendList.size()];
			for (int i = 0; i < recommendList.size(); i++) {
				answer[i] = recommendList.get(i).name;
			}
		} else {
			answer = new String[5];
			for (int i = 0; i < 5; i++) {
				answer[i] = recommendList.get(i).name;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		String user = "mrko";
		String[][] friends = {{"donut", "andole"}, {"donut", "jun"}, {"donut", "mrko"}, {"shakevan", "andole"},
			{"shakevan", "jun"}, {"shakevan", "mrko"}};
		String[] visitors = {"bedi", "bedi", "donut", "bedi", "shakevan"};

		Woo7 woo7 = new Woo7();
		String[] answer = woo7.solution(user, friends, visitors);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

}

