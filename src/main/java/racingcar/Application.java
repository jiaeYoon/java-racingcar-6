package racingcar;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

class Car {
    private String name;
    private Integer move;

    public Car(String name) {
        this.name = name;
        this.move = 0;
    }

    public void forward() {
        this.move += 1;
    }

    public String getName() {
        return name;
    }

    public Integer getMove() {
        return move;
    }
}

public class Application {
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<Car> cars = getCars();

        System.out.println("시도할 회수는 몇회인가요?");
        int times = getTimesToMove();

        race(cars, times);

        showWinner(cars);

    }

    public static void showWinner(List<Car> cars) {
        List<String> winnersName = getMaxMoveCar(cars);
        System.out.println("최종 우승자 : " + String.join(", ", winnersName));
    }

    public static List<String> getMaxMoveCar(List<Car> cars) {
        int max = 0;
        List<String> maxMoveCarName = new ArrayList<>();

        for (Car car : cars) {
            if (car.getMove() < max) {
                continue;
            }
            if (car.getMove() > max) {
                maxMoveCarName.clear();
                max = car.getMove();
            }
            maxMoveCarName.add(car.getName());
        }
        return maxMoveCarName;
    }

    public static void race(List<Car> cars, int times) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < times; i++) {
            for (Car car : cars) {
                int num = getRandomNum();
                forwardOrStop(car, num);
            }
            showResult(cars);
        }
    }

    public static void showResult(List<Car> cars) {
        String dash = "-";
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + dash.repeat(car.getMove()));
        }
        System.out.println();
    }

    public static void forwardOrStop(Car car, int num) {
        if (num >= 4) {
            car.forward();
        }
    }

    public static int getRandomNum() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public static int getTimesToMove() {
        String input = Console.readLine();
        return validNum(input);
    }

    public static int validNum(String input) {
        boolean matches = input.matches("^[0-9]+$");

        if (!matches) {
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(input);
    }

    public static List<Car> getCars() {

        List<Car> cars = new ArrayList<>();

        String[] names = Console.readLine().split(",");

        for (String name : names) {
            checkNameLength(name);
            cars.add(new Car(name));
        }

        return cars;
    }

    private static void checkNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }
}
