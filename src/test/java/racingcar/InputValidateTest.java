package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.validate.InputValidate;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidateTest {

    @Test
    void turnValidate() {

        String input = "-10";

        assertThatThrownBy(() -> InputValidate.turnValidate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}