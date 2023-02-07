package task.service;

import task.model.Car;

import java.util.List;

public interface CarService {


    List<Car> listCar(List<Car> cars, int count);
}
