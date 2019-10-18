package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface FoodRepo extends CrudRepository<Food,Integer>
{

}
