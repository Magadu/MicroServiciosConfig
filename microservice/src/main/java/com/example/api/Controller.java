package com.example.api;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.PostCervezas;
import com.example.model.Cerveza; 
 
@RestController
@RequestMapping("/tiendita")

public class Controller {
	 Logger logger = LoggerFactory.getLogger(Controller.class);
	 @Autowired
	 PostCervezas postCervezas;
	
	  @RequestMapping(value = "/cervezas", method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE)
	 public  List<Cerveza> cervezas(){
		  return postCervezas.getAll();
	 }
	 
	 @RequestMapping(value = "/cerveza/{id}", method = RequestMethod.GET,
		     
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public Cerveza service(@PathVariable("id") int id){
		 logger.info("id:"+id);
		 	return postCervezas.get(id);
		  }

	 @RequestMapping(value = "/cerveza", method = RequestMethod.POST,
		      consumes = MediaType.APPLICATION_JSON_VALUE,
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public void update(@RequestBody Cerveza cerveza){
		 	
		 postCervezas.update(cerveza);
		  
	 }
 
	 //insert
	 @RequestMapping(value = "/cerveza", method = RequestMethod.PUT,
		      consumes = MediaType.APPLICATION_JSON_VALUE,
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public void insert(@RequestBody Cerveza cerveza){
		 postCervezas.insert(cerveza);
		  
	 }
	 
	 
}
 