package repository;

import model.Car;

public interface CarRepository {

    void save(Car car);
    Car findByName(String name);
}
