package com.person.control;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.model.persona;
import com.person.rest.personaRest;

@RestController
@RequestMapping(value = "/api/persona")
@CrossOrigin(origins = "*")
public class personController {
	@Autowired
	private personaRest rest;
	
	@PostMapping
	public ResponseEntity<persona> save(@RequestBody persona persona){
		return new ResponseEntity<persona>(rest.save(persona),HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<persona>> getAll(){
		return new ResponseEntity<List<persona>>(rest.getAll(),HttpStatus.OK);
	}
	
	@PutMapping(path = {"/{id}"})
	public ResponseEntity<persona> update(@RequestBody persona persona,@PathParam("id") Long id) {
		persona.setId_persona(id);
		return new ResponseEntity<persona>(rest.save(persona),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public String delete(@RequestBody persona persona,@PathParam("id") Long id) {
		persona.setId_persona(id);
		rest.Delete(persona);
		return "ok";
	}
}
