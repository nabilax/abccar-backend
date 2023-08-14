package com.xyzcarportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyzcarportal.entity.Car;
import com.xyzcarportal.repo.CarRepo;

@Service("CarService")
public class CarImp implements CarService {
    @Autowired
    CarRepo ct;
	@Override
	public void AddCar(Car ca) {
		// TODO Auto-generated method stub
		
		ct.save(ca);
		System.out.println("added");
	}

	@Override
	public void DeleteCar(Car ca) {
		// TODO Auto-generated method stub
		ct.delete(ca);
	}

	@Override
	public List<Car> ShowCar() {
		// TODO Auto-generated method stub
		return ct.findAll();
	}

	@Override
	public List<Car> SearchByMake(String cmake) {
		return ct.searchByMake(cmake);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> SearchByModel(String cmodel) {
		// TODO Auto-generated method stub
		return ct.searchByModel(cmodel);
	}
	
	@Override
	public List<Car> SearchByRegisteration(String creg) {
		// TODO Auto-generated method stub
		return ct.searchByRegisteration(creg);
	}

	@Override
	public List<Car> SearchByPrice(String lo, String hi) {
		// TODO Auto-generated method stub
		return ct.searchByPrice(lo, hi);
	}


}
