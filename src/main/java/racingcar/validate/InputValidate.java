package racingcar.validate;


import java.util.List;

public class InputValidate {
    private static final int NAME_LENGTH_UPPER_LIMIT = 5;

    public static void nameValidate(List<String> carsName) {
        for (String name : carsName) {
            checkLength(name);
        }
    }

    private static void checkLength(String name) {
        if (name.length() > NAME_LENGTH_UPPER_LIMIT) {
            throw new IllegalArgumentException();
        }
    }

    public static void turnValidate(String input) {
        isPositiveNumber(input);
    }

    private static void isPositiveNumber(String input) {
        String regex = "^([1-9]+[0-9]*)$";
        if (!input.matches(regex)) {
            throw new IllegalArgumentException();
        }
    }
}
