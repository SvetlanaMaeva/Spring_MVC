package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import task.model.Car;
import task.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    public static List<Car> cars = new ArrayList<>();

    @GetMapping(value = "cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        cars.add(new Car("Lada", 987654231, 1_200_000));
        cars.add(new Car("Lamborghini", 999666333, 12_000_000));
        cars.add(new Car("Citroen", 528417369, 50_000));
        cars.add(new Car("Volvo", 654987123, 5_200_00));
        cars.add(new Car("BMV", 951623487, 9_000_100));

        CarServiceImp carsService = new CarServiceImp();
        if (count <= 5) {
            model.addAttribute("cars", carsService.listCar(cars, count));
        } else {
            model.addAttribute("cars", carsService.listCar(cars, 5));
        }
        return "cars";
    }

}
