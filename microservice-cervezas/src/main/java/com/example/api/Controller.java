package com.example.api;
 
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Cerveza;
import com.example.services.CervezasRepository; 
@RestController
@RequestMapping("/v1")

public class Controller {

	 @Autowired
	 CervezasRepository cervezasRepository;
	 
	 @RequestMapping(value = "/cervezas", method = RequestMethod.GET,
		      
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public List<Cerveza> cervezas(){
		 	 
		 	//return Dao.cervezas;
		 return cervezasRepository.getCervezas();
	 }
	 
	 @RequestMapping(value = "/cerveza/{id}", method = RequestMethod.GET,
		      
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public Cerveza service(@PathVariable("id") int id){
		 	 
		 	return cervezasRepository.getCerveza(id);
		  }

	 //update
	 @RequestMapping(value = "/cerveza", method = RequestMethod.POST,
		      consumes = MediaType.APPLICATION_JSON_VALUE,
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public void update(@RequestBody Cerveza cerveza){
		 		cervezasRepository.updateCerveza(cerveza);
		  
	 }
	 
	 
	 //add
	 @RequestMapping(value = "/cerveza", method = RequestMethod.PUT,
		      consumes = MediaType.APPLICATION_JSON_VALUE,
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public void add(@RequestBody Cerveza cerveza){
		 		cervezasRepository.insertCerveza(cerveza);
				   
		  
	 }
	 
	 
}
