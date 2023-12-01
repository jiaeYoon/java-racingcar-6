package racingcar.controller;

import racingcar.domain.Car;
import racingcar.validate.InputValidate;
import racingcar.util.Util;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Racing {
    private static final int MOVE_COUNT_INITIAL_VALUE = 0;

    private final List<Car> cars;
    private final int turn;

    public Racing() {
        this.cars = setCars();
        this.turn = setTurn();
    }

    private static List<Car> setCars() {
        String input = InputView.readCarsName();
        List<String> carsName = Util.split(input);
        InputValidate.nameValidate(carsName);
        return Car.createCars(carsName);
    }

    private int setTurn() {
        String input = InputView.readTurn();
        InputValidate.turnValidate(input);
        return Util.toInt(input);
    }

    public void start() {
        int moveCount = initMoveCount();
        while (moveCount < turn) {
            cars.forEach(Car::move);
            printMoveResult(moveCount);
            moveCount++;
        }
        printWinner();
    }

    private int initMoveCount() {
        return MOVE_COUNT_INITIAL_VALUE;
    }

    private void printMoveResult(int moveCount) {
        if (moveCount == MOVE_COUNT_INITIAL_VALUE) {
            OutputView.printTurnResultNotice();
        }
        OutputView.printTurnResult(cars);
    }

    private void printWinner() {
        OutputView.printWinner(cars);
    }
}
