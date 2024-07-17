package com.product.Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.product.entity.production;

@Repository 
public class productinDao {
	
	public ArrayList<production>getAllproductionName()
	{
		ArrayList<production> p = new ArrayList<production>();
		p.add(new production(1,"TV",20,50000));
		p.add(new production(2,"car",30,84000));
		p.add(new production(3,"shampu",550,50000));
		p.add(new production(4,"gulab",50,0000));
		
		
		return p;
		
	}
	

}
