package slab.q1;

public class WeatherCalculator {
    private static final int MAX_SCORE = 20;

    public int calculate(int value, int index) {
        return Weather.from(value, index).getScore();
    }
}
