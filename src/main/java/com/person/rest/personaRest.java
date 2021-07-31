package com.person.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.dao.*;
import com.person.model.*;

@Service
public class personaRest {
	@Autowired
	personaDAO dao;
	public persona save(persona p) {
		
		return dao.save(p);
	}
	public List<persona> getAll() {
		
		return dao.findAll();
	}
	public persona getById(Long id) {
		
		return dao.getById(id);
	}
	public void Delete(persona p) {
		
		 dao.delete(p);
	}
	public persona Updated(persona p) {
		
		return dao.save(p);
	}
}
