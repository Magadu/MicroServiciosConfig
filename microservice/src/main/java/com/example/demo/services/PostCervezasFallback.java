package com.example.demo.services;

import java.util.List; 

import org.springframework.stereotype.Component;

import com.example.model.Cerveza;

@Component
public class PostCervezasFallback  implements PostCervezas {

	@Override
	public List<Cerveza> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cerveza get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cerveza cerveza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Cerveza cerveza) {
		// TODO Auto-generated method stub
		
	}
 

}
