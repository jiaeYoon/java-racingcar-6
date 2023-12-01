package racingcar.config;

public enum RacingCarConfig {

    NAME_LENGTH_UPPER_LIMIT(5),

    FORWARD_LOWER_LIMIT(4),

    MOVE_COUNT_INITIAL_VALUE(0);

    private final int value;

    RacingCarConfig(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
