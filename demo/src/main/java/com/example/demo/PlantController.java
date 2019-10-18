package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class PlantController
{
	@Autowired
	PlantRepo repo;
	
	@RequestMapping("/plants")
	public @ResponseBody List<Plant> plantDetails()
	{

		Iterable<Plant> y=repo.findAll();
		List<Plant> x= PlantController.getCollectionFromIteralbe(y);
		return x;
	}

	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addPlant")
	public String addAlien(Plant plant)
	{
		repo.save(plant);
		return "home.jsp";
	}
	
	public static List<Plant>   getCollectionFromIteralbe(Iterable<Plant> itr) 
		{ 
		// Create an empty Collection to hold the result 
				List<Plant> cltn = new ArrayList<>(); 
		
		// Iterate through the iterable to  add each element into the collection 
		for (Plant t : itr) 
		cltn.add(t); 
		
		// Return the converted collection 
		return cltn; 
		} 
}
