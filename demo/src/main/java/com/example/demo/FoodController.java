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
	public class FoodController {

		@Autowired
		FoodRepo repo;
		
		@RequestMapping("/foods")
		public @ResponseBody List<Food> plantDetails()
		{

			Iterable<Food> y=repo.findAll();
			List<Food> x= FoodController.getCollectionFromIteralbe(y);
			return x;
		}

		
		@RequestMapping("/addFood")
		public String addAlien(Food food)
		{
			repo.save(food);
			return "foodHome.jsp";
		}
		
		public static List<Food>   getCollectionFromIteralbe(Iterable<Food> itr) 
		{ 
			// Create an empty Collection to hold the result 
			List<Food> cltn = new ArrayList<>(); 
			
			// Iterate through the iterable to  add each element into the collection 
			for (Food t : itr) 
			cltn.add(t); 
			
			// Return the converted collection 
			return cltn; 
			} 
	}
