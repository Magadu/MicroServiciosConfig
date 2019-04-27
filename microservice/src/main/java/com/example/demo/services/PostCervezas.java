package com.example.demo.services;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Cerveza;
 

@FeignClient(name = "microservice-cervezas", fallback = PostCervezasFallback.class) 
public interface PostCervezas {

    @RequestMapping(method = RequestMethod.GET, value = "/v1/cervezas")
    List<Cerveza>  getAll();
	 
    
    @RequestMapping(method = RequestMethod.GET, value = "/v1/cerveza/{id}", produces = "application/json")
      Cerveza   get(@PathVariable("id") int id);
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/v1/cerveza")
    void  update(@RequestBody Cerveza cerveza);
     
    @RequestMapping(method = RequestMethod.PUT, value = "/v1/cerveza")
    void  insert(@RequestBody Cerveza cerveza);
}

  