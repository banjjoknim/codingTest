package slab.q1;

import java.util.*;

public class Solution {
    private static final Comparator<Result> COMPARATOR = Comparator.comparing(Result::getTotalScore, Comparator.reverseOrder())
            .thenComparing(Result::getDay, Comparator.comparing(Day::getPriority, Comparator.reverseOrder()));

    private TemperatureCalculator temperatureCalculator = new TemperatureCalculator();
    private WeatherCalculator weatherCalculator = new WeatherCalculator();

    public int[] solution(int[][] data) {
        List<Result> results = new ArrayList<>();
        List<Result> worst = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            int skyScore = weatherCalculator.calculate(data[i][0], 0);
            int precipitationScore = weatherCalculator.calculate(data[i][1], 1);
            int temperatureScore = temperatureCalculator.calculate(data[i][2]);
            int weatherScore = skyScore + precipitationScore;
            if (weatherScore > 20) {
                weatherScore = 20;
            }
            int totalScore = temperatureScore + weatherScore;
            results.add(new Result(totalScore, Day.from(i)));
            if (Weather.from(data[i][0], 0).isCloudy() || Weather.from(data[i][1], 1).isRainy() || data[i][2] <= 0 || data[i][2] >= 30) {
                worst.add(new Result(totalScore, Day.from(i)));
            }
        }
        Collections.sort(results, COMPARATOR);
        Collections.sort(worst, COMPARATOR);
        System.out.println(results);
        System.out.println(worst);
        Result best = results.remove(0);
        int worstDayIndex = -1;
        for (Result result : worst) {
            if (!result.equals(best)) {
                worstDayIndex = result.getDay().getIndex();
            }
        }
        int[] answer = {best.getDay().getIndex(), worstDayIndex};
        return answer;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 0, 11}, {3, 1, 15}, {2, 0, 16}, {4, 0, 17}, {2, 0, 15}, {2, 1, 14}, {2, 0, 12}};
//        int[][] input = {{4, 0, 12}, {1, 0, 16}, {3, 0, 18}, {3, 0, 17}, {2, 0, 15}, {3, 2, 22}, {2, 1, 17}};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(input)));
    }
}
