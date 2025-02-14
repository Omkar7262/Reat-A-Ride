package com.rentalcar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rentalcar.pojos.Car;
import com.rentalcar.pojos.Car.CarStatus;

public interface CarDao extends JpaRepository<Car, Long> {

	List<Car> findByStatus(CarStatus status);
	
	@Query("UPDATE Car c SET c.status = 'BOOKED' WHERE c.id = :carId")
    int markCarAsBooked(Long carId);
}
