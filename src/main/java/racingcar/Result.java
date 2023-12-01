package racingcar;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private final static String DASH = "-";

    public static String getProgress(Car car) {
        return DASH.repeat(car.getDistance());
    }

    public static List<String> getWinner(List<Car> cars) {
        List<String> winnersName = new ArrayList<>();

        int max = 0;
        for (Car car : cars) {
            int distance = car.getDistance();
            if (distance < max) {
                continue;
            }
            if (distance > max) {
                winnersName.clear();
                max = distance;
            }
            winnersName.add(car.getName());
        }
        return winnersName;
    }
}
