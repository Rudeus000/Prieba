package com.example.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persona.entity.Persona;
import com.example.persona.service.PersonaService;

@RestController
@RequestMapping("/enviar")
public class PersonaController {
	@Autowired 
	PersonaService x;
	
	@PostMapping
	public Persona registrarPersona(@RequestBody Persona a) {
		return x.registrar(a);
	}
	@PutMapping
	public Persona actualizarPersona(@RequestBody Persona a) {
		return x.actualizar(a);
		
	}
	@DeleteMapping
	public void eliminar (@RequestBody Persona a) {
		
	}
	@GetMapping
	public List<Persona>consultar(@RequestBody Persona a){
		return x.consultar();
	}

}
