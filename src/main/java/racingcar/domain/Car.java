package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private static final int START_DISTANCE = 0;

    private final String name;
    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = START_DISTANCE;
    }

    public static List<Car> createCars(List<String> carsName) {
        List<Car> cars = new ArrayList<>();
        for (String name : carsName) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public void move() {
        MovementCondition movementCondition = new MovementCondition();
        if (movementCondition.canMovable()) {
            forward();
        }
    }

    private void forward() {
        distance++;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
