package com.xyzcarportal.service;

import java.util.List;

import com.xyzcarportal.entity.Car;




public interface CarService {
	void AddCar(Car ca);
	void DeleteCar(Car ca);
	public List<Car> ShowCar();
	public List<Car> SearchByMake(String cmake);
	public List<Car> SearchByModel(String cmodel);
	public List<Car> SearchByRegisteration(String creg);
	public List<Car> SearchByPrice(String lo, String hi);
}
