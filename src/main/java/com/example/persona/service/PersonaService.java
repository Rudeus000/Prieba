package com.example.persona.service;

import java.util.List;

import com.example.persona.entity.Persona;

public interface PersonaService {
	public Persona registrar (Persona a);
	public Persona actualizar(Persona a);
	public void eliminar (Persona a );
	
	public List<Persona>consultar();

}
