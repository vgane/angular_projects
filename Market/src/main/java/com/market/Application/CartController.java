package com.market.Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.models.Cart;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CartController {


	
	private List<Cart> cartList = createList();
	@RequestMapping("/cart")
	public List<Cart> cart() {	
		return cartList;
		
	}

	
	private static List<Cart> createList() {
		List<Cart>cartList = new ArrayList<>();
		Cart cart1=new Cart();
		cart1.setNumberOfItems("1");
		
		Cart cart2=new Cart();
		cart2.setNumberOfItems("2");
		
		cartList.add(cart1);
		cartList.add(cart2);
		return cartList;
		
	}
}