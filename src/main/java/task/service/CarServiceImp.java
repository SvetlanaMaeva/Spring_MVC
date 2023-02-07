package task.service;

import org.springframework.stereotype.Service;
import task.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> listCar(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
