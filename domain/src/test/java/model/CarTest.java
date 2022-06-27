package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import support.builder.CarBuilder;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("자동차를 한칸 전진 시킨다.")
    void move() {
        Car car = new Car("seok2");

        car.move(() -> true);

        Car expected = new CarBuilder("seok2")
                .position(1)
                .build();

        assertThat(car).isEqualTo(expected);
    }

}