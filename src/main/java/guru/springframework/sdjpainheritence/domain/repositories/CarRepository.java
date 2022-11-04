package guru.springframework.sdjpainheritence.domain.repositories;

import guru.springframework.sdjpainheritence.domain.singletable.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
