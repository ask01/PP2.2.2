package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car("BMW", "blue", 20000));
        car.add(new Car("Opel", "black", 10000));
        car.add(new Car("Lada", "white", 8000));
        car.add(new Car("Audi", "brown", 25000));
        car.add(new Car("Scoda", "yellow", 15000));
    }

    public List<Car> getCars(int count) {
        if(count == 0) {
            return car;
        }
        return car.stream().limit(count).collect(Collectors.toList());
    }


}
