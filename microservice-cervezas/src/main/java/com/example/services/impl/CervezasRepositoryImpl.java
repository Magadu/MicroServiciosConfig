package com.example.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Cerveza;
import com.example.services.CervezasRepository;

@Service
public class CervezasRepositoryImpl implements CervezasRepository{

    public static  List<Cerveza> cervezas = new ArrayList<>(); 
	
	 
	
   static  {
	   
	   
	   cervezas.add( new Cerveza("Cerveza", "Cerveza oscura Victoria Vickychelada 4 latas de 473 ml c/u", 50.00 ,1) );
	   cervezas.add( new Cerveza("Cerveza", "Cerveza clara Modelo Especial 6 botellas de 355 ml c/u", 96.00,2) );
	   cervezas.add(  new Cerveza("Cerveza", "Cerveza clara Corona Extra 12 botellas de 355 ml c/u", 156.00,3) );
	   cervezas.add( new Cerveza("Cerveza", "Cerveza clara Modelo especial 4 latas de 473 ml c/u", 50.00,4) ); 
		
	}
   
   
	@Override
	public Cerveza getCerveza(int id) {
		Cerveza cerveza = cervezas.stream()
				  .filter(c -> id==c.getId())
				  .findAny()
				  .orElse(null);
		return cerveza;
	}

	@Override
	public List<Cerveza> getCervezas() {
		return cervezas;
	}

	@Override
	public void updateCerveza(Cerveza cerveza) {
		Cerveza cervezaAux = cervezas.stream()
				  .filter(c -> cerveza.getId()==c.getId())
				  .findAny()
				  .orElse(null);
		
		if(cervezaAux!=null) {
			cervezaAux.setNombre(cerveza.getNombre());
			cervezaAux.setDescripcion(cerveza.getDescripcion());
			cervezaAux.setPrecio(cerveza.getPrecio());
			
		}
		
	}

	@Override
	public void insertCerveza(Cerveza cerveza) {
		Cerveza cervezaAux = cervezas.stream()
				  .filter(c -> cerveza.getId()==c.getId())
				  .findAny()
				  .orElse(null);
		if(cervezaAux==null) {
			
			cervezas.add(cerveza);
		}
		
		
	}

}
