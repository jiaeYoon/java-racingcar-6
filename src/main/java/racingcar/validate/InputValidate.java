package racingcar.validate;

import racingcar.config.RacingCarConfig;

import java.util.List;

public class InputValidate {

    public static void nameValidate(List<String> carsName) {
        for (String name : carsName) {
            checkLength(name, RacingCarConfig.NAME_LENGTH_UPPER_LIMIT.getValue());
        }
    }

    private static void checkLength(String name, int lengthLimit) {
        if (name.length() > lengthLimit) {
            throw new IllegalArgumentException();
        }
    }

    public static void turnValidate(String input) {
        isNotNegativeNumber(input);
    }

    private static void isNotNegativeNumber(String input) {
        String regex = "^[0-9]+$";
        if (!input.matches(regex)) {
            throw new IllegalArgumentException();
        }
    }
}
