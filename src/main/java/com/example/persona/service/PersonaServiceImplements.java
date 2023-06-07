package com.example.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persona.entity.Persona;
import com.example.persona.rerpository.PersonaRepository;
@Service
public class PersonaServiceImplements implements PersonaService{
	@Autowired
	PersonaRepository x;

	@Override
	public Persona registrar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Persona actualizar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Persona a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
	

}
