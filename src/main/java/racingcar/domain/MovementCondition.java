package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class MovementCondition {
    private final static int FORWARD_LOWER_LIMIT = 4;
    private final static int RANDOM_NUMBER_LOWER_BOUND = 0;
    private final static int RANDOM_NUMBER_UPPER_BOUND = 9;

    private final int condition;

    public MovementCondition() {
        this.condition = getRandomNumber();
    }

    public boolean canMovable() {
        return condition >= FORWARD_LOWER_LIMIT;
    }

    private static int getRandomNumber() {
        return Randoms.pickNumberInRange(RANDOM_NUMBER_LOWER_BOUND, RANDOM_NUMBER_UPPER_BOUND);
    }
}