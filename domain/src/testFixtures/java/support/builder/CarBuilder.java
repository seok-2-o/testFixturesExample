package support.builder;

import model.Car;

public class CarBuilder {

    private final String name;
    private int position;

    public CarBuilder(String name) {
        this.name = name;
    }

    public CarBuilder position(int position) {
        this.position = position;
        return this;
    }

    public Car build() {
        Car car = new Car(this.name);
        for (int idx = 0; idx < position; idx++) {
            car.move(() -> true);
        }
        return car;
    }

}
