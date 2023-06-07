package com.example.persona.rerpository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.persona.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona,String> {
	

}
