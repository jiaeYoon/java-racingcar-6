package racingcar.util;

import java.util.Arrays;
import java.util.List;

public class Util {

    private final static String SPLIT_REGEX = ",";
    private final static String DELIMITER = ", ";

    public static List<String> split(String input) {
        return Arrays.asList(input.split(SPLIT_REGEX));
    }

    public static String join(List<String> names) {
        return String.join(DELIMITER, names);
    }

    public static int toInt(String input) {
        return Integer.parseInt(input);
    }
}
