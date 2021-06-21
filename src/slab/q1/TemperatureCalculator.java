package slab.q1;

public class TemperatureCalculator {
    private static final int TEMPERATURE_MAX_SCORE = 20;
    private static final int DEFAULT_VALUE = 22;
    private static final int ZERO = 0;

    public int calculate(int value) {
        int difference = TEMPERATURE_MAX_SCORE - Math.abs(DEFAULT_VALUE - value);
        if (difference < ZERO) {
            return ZERO;
        }
        return difference;
    }
}
