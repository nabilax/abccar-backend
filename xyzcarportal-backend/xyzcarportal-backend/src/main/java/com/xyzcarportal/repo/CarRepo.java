package com.xyzcarportal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xyzcarportal.entity.Car;



public interface CarRepo extends JpaRepository<Car, Integer> {
	@Query("SELECT c from Car c WHERE make=:cmake")
	public List<Car> searchByMake(String cmake);
	@Query("SELECT c from Car c WHERE model=:cmodel")
	public List<Car> searchByModel(String cmodel);
	@Query("SELECT c from Car c WHERE registeration=:creg")
	public List<Car> searchByRegisteration(String creg);
	@Query("SELECT c from Car c WHERE price BETWEEN :lo AND :hi")
	public List<Car> searchByPrice(String lo, String hi);

}
