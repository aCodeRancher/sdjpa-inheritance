package guru.springframework.sdjpainheritence.domain.bootstrap;

import guru.springframework.sdjpainheritence.domain.joined.ElectricGuitar;
import guru.springframework.sdjpainheritence.domain.repositories.CarRepository;
import guru.springframework.sdjpainheritence.domain.repositories.ElectricGuitarRepository;
import guru.springframework.sdjpainheritence.domain.repositories.TruckRepository;
import guru.springframework.sdjpainheritence.domain.singletable.Car;
import guru.springframework.sdjpainheritence.domain.singletable.Truck;
import guru.springframework.sdjpainheritence.domain.singletable.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 7/12/22.
 */
@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    ElectricGuitarRepository electricGuitarRepository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    TruckRepository truckRepository;

    @Override
    public void run(String... args) throws Exception {
        ElectricGuitar eg = new ElectricGuitar();
        eg.setNumberOfStrings(6);
        eg.setNumberOfPickups(2);
        electricGuitarRepository.save(eg);

        Car  car = new Car();
        car.setTrimLevel("trimLevel1");
        carRepository.save(car);

        Truck truck = new Truck();
        truck.setPayload(1);
        truckRepository.save(truck);
    }
}
