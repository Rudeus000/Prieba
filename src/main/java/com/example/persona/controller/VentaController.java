package com.example.persona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persona.entity.Venta;
import com.example.persona.service.VentaService;

@RestController
@RequestMapping("/enviaremos")
public class VentaController {
	@Autowired
	VentaService x;
	
	@PostMapping
	public Venta registrarVenta(@RequestBody Venta a) {
		return x.registrar(a);
	}
	@PutMapping
	public Venta actualizarVenta(@RequestBody Venta a) {
		return x.actualizar(a);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Venta a) {
		
	}
	

}
