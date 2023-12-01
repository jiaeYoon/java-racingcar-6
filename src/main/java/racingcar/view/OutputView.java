package racingcar.view;

import racingcar.domain.Car;
import racingcar.Result;
import racingcar.util.Util;

import java.util.List;

public class OutputView {

    public static void printTurnResultNotice() {
        System.out.println("실행 결과");
    }

    public static void printTurnResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.printf("%s : %s\n", car.getName(), Result.getProgress(car));
        }
        System.out.println();
    }

    public static void printWinner(List<Car> cars) {
        List<String> winnersName = Result.getWinner(cars);
        System.out.print("최종 우승자 : ");
        System.out.println(Util.join(winnersName));
    }
}
