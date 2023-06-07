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

import com.example.persona.entity.Ingreso;
import com.example.persona.service.IngresoService;

@RestController
@RequestMapping("/envio")
public class IngresoController {
	@Autowired
	IngresoService x;
	
	
	@PostMapping
	public Ingreso registrarIngreso(@RequestBody Ingreso a) {
		return x.registrar(a);
	}
	@PutMapping
	public Ingreso actualizarIngreso(@RequestBody Ingreso a) {
		return x.actualizar(a);
	}
	@DeleteMapping
	public void eliminar (@RequestBody Ingreso a) {
		
	}
	@GetMapping
	public List<Ingreso>consultar(@RequestBody Ingreso a){
		return x.consultar();
	}
}
	
	
	
	

