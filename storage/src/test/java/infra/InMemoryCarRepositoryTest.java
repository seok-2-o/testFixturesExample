package infra;

import model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repository.CarRepository;
import support.builder.CarBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class InMemoryCarRepositoryTest {

    private CarRepository repository = new InMemoryCarRepository();

    @BeforeEach
    void setup() {
        Car car = new Car("seok2");
        car.move(() -> true);
        repository.save(car);
    }


    @Test
    @DisplayName("자동차를 이름으로 조회한다.")
    void findByName() {

        Car car = repository.findByName("seok2");

        Car expected = new CarBuilder("seok2")
                .position(1)
                .build();

        assertThat(car).isEqualTo(expected);
    }


}
