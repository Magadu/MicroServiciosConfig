package com.example.services;

import java.util.List;

import com.example.model.Cerveza;

public interface CervezasRepository {
	Cerveza getCerveza(int id);
	List<Cerveza> getCervezas();
	void updateCerveza(Cerveza cerveza);
	void insertCerveza(Cerveza cerveza);
	
}
