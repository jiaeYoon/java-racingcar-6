package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public static int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
