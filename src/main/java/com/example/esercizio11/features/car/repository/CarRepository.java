package com.example.esercizio11.features.car.repository;

import com.example.esercizio11.features.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
