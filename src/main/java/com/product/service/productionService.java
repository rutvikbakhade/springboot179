package com.product.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Dao.productinDao;
import com.product.entity.production;

@Service
public class productionService {
	@Autowired
	productinDao dao;
	public ArrayList<production>getAllproductionName()
	{
		ArrayList <production> s = new ArrayList <production>();
		ArrayList <production> s1 = dao.getAllproductionName();
		
		for(production p : s1)
		{
			System.out.println(p);
		}
		return s1;
		
	}
	
	

}
