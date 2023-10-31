package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RaceTest {
    private Race race;

    @BeforeEach
    void setUp() {
        race = new Race();
    }

    @Test
    void 단독_우승자_선정() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("woni");
        Car car3 = new Car("jun");
        List<Car> carList = Arrays.asList(car1, car2, car3);

        car1.move();
        car1.move();
        car2.move();
        car3.move();
        List<String> winners = race.winnerSelect(carList);

        assertThat(winners).containsExactly("pobi");
    }

    @Test
    void 여러명의_우승자_선정() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("woni");
        Car car3 = new Car("jun");
        List<Car> carList = Arrays.asList(car1, car2, car3);

        car1.move();
        car2.move();
        List<String> winners = race.winnerSelect(carList);

        assertThat(winners).containsExactly("pobi", "woni");
    }
}
