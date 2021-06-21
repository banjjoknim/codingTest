package slab;

import java.util.*;

public class Solution1 {

    private static final int FULL_SCORE = 20;
    private static final int BASIC_SCORE = 22;
    private static final int HIGHER_TEMPERATURE_EXCEPTED_DEGREE = 30;
    private static final int LOWER_TEMPERATURE_EXCEPTED_DEGREE = 0;
    public static final int EXCEPTED_TEMPERATURE_SCORE = -20;

    private static class TemperatureCalculator {
        public int calculateScore(int degree) {
            if (degree >= HIGHER_TEMPERATURE_EXCEPTED_DEGREE || degree <= LOWER_TEMPERATURE_EXCEPTED_DEGREE) {
                return EXCEPTED_TEMPERATURE_SCORE;
            }
            return FULL_SCORE - Math.abs(BASIC_SCORE - degree);
        }
    }

    enum Sky {
        GOOD(1, 20),
        SMALL_CLOUD(2, 20),
        MORE_CLOUD(3, 17),
        BAD(4, 10);

        private int value;
        private int score;

        Sky(int value, int score) {
            this.value = value;
            this.score = score;
        }

        private static int score(int value) {
            return Arrays.stream(Sky.values())
                    .filter(sky -> sky.value == value)
                    .findAny()
                    .get()
                    .score;
        }

        private static Sky from(int value) {
            return Arrays.stream(Sky.values())
                    .filter(sky -> sky.value == value)
                    .findAny()
                    .get();
        }

        private boolean isBad() {
            return this == BAD;
        }
    }

    enum Precipitation {
        NOTHING(0, 0),
        RAIN(1, 5),
        SNOW(2, 14);

        private int value;
        private int score;

        Precipitation(int value, int score) {
            this.value = value;
            this.score = score;
        }

        private static int score(int value) {
            return Arrays.stream(Precipitation.values())
                    .filter(precipitation -> precipitation.value == value)
                    .findAny()
                    .get()
                    .score;
        }

        private static Precipitation from(int value) {
            return Arrays.stream(Precipitation.values())
                    .filter(precipitation -> precipitation.value == value)
                    .findAny()
                    .get();
        }

        private boolean isRain() {
            return this == RAIN;
        }
    }

    enum Day {
        MON(0, 1),
        TUE(1, 2),
        WED(2, 4),
        THU(3, 3),
        FRI(4, 6),
        SAT(5, 7),
        SUN(6, 5);

        private int index;
        private int priority;

        Day(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        public static Day from(int index) {
            return Arrays.stream(Day.values())
                    .filter(day -> day.index == index)
                    .findAny()
                    .get();
        }
    }

    private static class WeatherCalculator {
        public int calculateSkyScore(int value) {
            return Sky.score(value);
        }

        private int calculatePrecipitationScore(int value) {
            return Precipitation.score(value);
        }
    }

    private static class Result implements Comparable<Result> {
        private Day day;
        private int score;

        public Result(Day day, int score) {
            this.day = day;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "day=" + day +
                    ", score=" + score +
                    '}';
        }

        @Override
        public int compareTo(Result o) {
            int compare = Integer.compare(this.score, o.score);
            if (compare == 0) {
                return Integer.compare(this.day.priority, o.day.priority);
            }
            return compare;
        }
    }

    public int[] solution(int[][] data) {
        int[] answer = new int[2];
        TemperatureCalculator temperatureCalculator = new TemperatureCalculator();
        WeatherCalculator weatherCalculator = new WeatherCalculator();
        List<Result> best = new ArrayList<>();
        List<Result> worst = new ArrayList<>();
        int index = 0;
        for (int[] ints : data) {
            Day day = Day.from(index);
            index++;
            int skyScore = weatherCalculator.calculateSkyScore(ints[0]);
            int precipitationScore = weatherCalculator.calculatePrecipitationScore(ints[1]);
            int temperatureScore = temperatureCalculator.calculateScore(ints[2]);
            int totalScore = skyScore + precipitationScore + temperatureScore;
            if (Sky.from(ints[0]).isBad() || Precipitation.from(ints[1]).isRain() || skyScore == EXCEPTED_TEMPERATURE_SCORE) {
                worst.add(new Result(day, totalScore));
                continue;
            }
            best.add(new Result(day, totalScore));
        }
        Collections.sort(best, Comparator.reverseOrder());
        Collections.sort(worst, Comparator.reverseOrder());
        int bestDayIndex = best.get(0).day.index;
        int worstDayIndex = -1;
        if (!worst.isEmpty()) {
            worstDayIndex = worst.get(0).day.index;
        }
        answer[0] = bestDayIndex;
        answer[1] = worstDayIndex;
        return answer;
    }
}
