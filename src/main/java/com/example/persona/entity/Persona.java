package com.example.persona.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Persona")
@Table(name="persona")
public class Persona {
	@Id
	String tipo_persona;
	String nombre;
	String tipo_documento;
	String direccion;
	int telefono;
	String email;
	
	public Persona() {
		super();
	}
	public Persona(String tipo_persona, String nombre, String tipo_documento, String direccion, int telefono,
			String email) {
		super();
		this.tipo_persona = tipo_persona;
		this.nombre = nombre;
		this.tipo_documento = tipo_documento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	public String getTipo_persona() {
		return tipo_persona;
	}
	public void setTipo_persona(String tipo_persona) {
		this.tipo_persona = tipo_persona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

		

}
