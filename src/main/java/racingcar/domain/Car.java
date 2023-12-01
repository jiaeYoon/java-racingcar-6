package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public static List<Car> createCars(List<String> carsName) {
        List<Car> cars = new ArrayList<>();
        for (String name : carsName) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public void move() {
        boolean goForward = goForwardOrStop();
        if (goForward) {
            forward();
        }
    }

    private void forward() {
        distance++;
    }

    private boolean goForwardOrStop() {
        return Util.getRandomNumber() >= RacingCarConfig.FORWARD_LOWER_LIMIT.getValue();
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
