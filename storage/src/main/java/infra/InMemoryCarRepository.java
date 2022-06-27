package infra;

import model.Car;
import repository.CarRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCarRepository implements CarRepository {

    private Map<String, Car> storage = new HashMap<>();


    @Override
    public void save(Car car) {
        storage.put(car.getId(), car);
    }

    @Override
    public Car findByName(String name) {
        return storage.get(name);
    }
}
