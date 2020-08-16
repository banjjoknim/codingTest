import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Woo5Test {

	@ParameterizedTest
	@ValueSource(strings = {
		// "[0.0]", "[-1.0]", "[0.5]", "[1.2]", "[3.0]", "[1.0]", "[1.5]",
		// "[2.0]", "[1.0, 2.0, 1.0]", "[1.0, 1.0, 2.0, 2.0]",
		"[1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 2.0, 2.0, 1.0, 2.0, 2.0, 2.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 2.0, 1.0, 2.0]"
		// "[1.5, 2.0, 1.0]", "[1.5, 2.5, 1.0, 1.0]",
		// "[1.5, 2.5, 1.0, 2.5, 1.0]", "[1.5, 2.5, 1.0, -1.0]",
		// "[1.5, 0.5, 1.0, 2.0]", "[1.5, 2.5, 1.0, 2.0, 1.2]",
		// "[1.5, 2.5, 1.0, 3.0, 1.5]",
		// "[1.5, 2.5, 1.0, 2.0, 1.5, 2.0, 2.0, 2.0, 1.5, 2.5, 1.0, 2.0, 1.5, 2.0, 2.0, 2.0, 1.5, 2.5, 1.0, 2.0, 1.5, 2.0, 2.0, 2.0]",
		// "[1.5, 2.5, 0.0, 1.0]"
	})
	public void test(String input) {
		Woo5 woo5 = new Woo5(); // ["0.0"]
		String[] testHistory = input.replace("[", "").replace("]", "").split(", ");
		int[] testAnswer = woo5.solution(testHistory);

		try {
			String[] testAnswerString = new String[] {
				// "[-1]", "[-1]", "[-1]", "[-1]", "[-1]", "[3000]", "[14000]",
				// "[14000]", "[3000, 14000, 11000]", "[3000, 11000, 14000, 7000]",
				// "[3000, 11000, 14000, 7000, 13000, 1000, 14000, 17000, 3000, 15000, 17000, 14000, 1000, 16000, 15000, 3000, 4000, 13000, 15000, 6000, 11000, 14000, 4000, 16000]",
				// "[14000, 3000, 15000]", "[14000, 13000, 4000, 3000]", "[14000, 13000, 4000, 17000, 3000]",
				// "[-1]", "[-1]", "[-1]", "[-1]",
				// "[14000, 13000, 4000, 16000, 5000, 14000, 16000, 15000, 2000, 18000, 11000, 16000, 4000, 14000, 17000, 15000, 3000, 16000, 11000, 7000, 14000, 14000, 17000, 4000]",
				// "[-1]"
			};
			for (int j = 0; j < testHistory.length; j++) {
				int[] answer = new int[testAnswer.length];
				// for (int i = 0; i < testAnswerString[j].split(",").length; i++) {
				// 	answer[i] = Integer.parseInt(testAnswerString[j].replaceAll("\\[", "")
				// 		.replaceAll("]", "").replace(" ", "").split(",")[i]);
				// }
				answer = new int[] {3000, 11000, 14000, 7000, 13000, 1000, 14000, 17000, 3000, 15000, 17000, 14000,
					1000, 16000, 15000, 3000, 4000, 13000, 15000, 6000, 11000, 14000, 4000, 16000};
				Assertions.assertArrayEquals(testAnswer, answer);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}

