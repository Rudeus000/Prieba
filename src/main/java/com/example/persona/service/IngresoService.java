package com.example.persona.service;

import java.util.List;

import com.example.persona.entity.Ingreso;


public interface IngresoService {
	public Ingreso registrar (Ingreso a);
	public Ingreso actualizar(Ingreso a);
	public void eliminar (Ingreso a );
	
	public List<Ingreso>consultar();
}
