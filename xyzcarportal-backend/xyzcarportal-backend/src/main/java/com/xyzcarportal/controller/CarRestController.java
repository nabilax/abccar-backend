package com.xyzcarportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xyzcarportal.entity.Car;
import com.xyzcarportal.service.CarImp;




@RestController
public class CarRestController {
            @Autowired
            CarImp ctservice;
            
            //add records
        	@PostMapping(value = "/postcar")
        	public String postCar(@RequestBody Car ca)
        	{
        		System.out.println(ca.getName());
        		ctservice.AddCar(ca);
        		return "data added";
        	}
        	
        	//show cars
       	 //show all records
       	 @GetMapping("/showcar")
       	 public List<Car> showcar()
       	 {
       		 return ctservice.ShowCar();
       	 }
       	 
       	 //Serach by make
 		//http://localhost:9090/searchmake?carmake=2020
 		 @GetMapping(value="/searchmake")
 		 public List<Car> searchcarmake(@RequestParam("carmake") String cmake)
 		 {
 			
 			 return  ctservice.SearchByMake(cmake);
 		 }
 		 
       	 //Serach by model
 		//http://localhost:9090/searchmodel?carmodel=hybridx
 		 @GetMapping(value="/searchmodel")
 		 public List<Car> searchcarmodel(@RequestParam("carmodel") String cmodel)
 		 {
 			
 			 return  ctservice.SearchByModel(cmodel);
 		 }
 		 

 	       	 //Serach by registeration
 	 		//http://localhost:9090/searchreg?carreg=D-11-9999
 	 		 @GetMapping(value="/searchreg")
 	 		 public List<Car> searchcarregisteration(@RequestParam("carreg") String creg)
 	 		 {
 	 			
 	 			 return  ctservice.SearchByRegisteration(creg);
 	 		 }
 	 		 
 	       	 //Serach by price
 	 		//http://localhost:9090/searchprice/rm1800/rm2000
 	 		 @GetMapping(value="/searchprice/{lower}/{higher}")
 	 		 public List<Car> searchcarprice(@PathVariable("lower") String lo, 
 	 				 @PathVariable("higher") String hi)
 	 		 {
 	 			
 	 			 return  ctservice.SearchByPrice(lo, hi);
 	 		 }
 		 
 	 	

}

/*
 * API----http://localhost:9090/searchprice/10/1000     @GetMapping(value =
 * "/searchprice/{lower}/{higher}")     public List<Product>
 * searchByPrice(@PathVariable("lower") Double lo,
 *             @PathVariable("higher") Double hi) {
 *        System.out.println(lo+" "+hi);                 return
 * prodservice.searchByPrice(lo, hi);
 */
