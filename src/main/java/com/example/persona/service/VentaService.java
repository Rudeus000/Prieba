package com.example.persona.service;

import java.util.List;

import com.example.persona.entity.Venta;

public interface VentaService {
	public Venta registrar (Venta a);
	public Venta actualizar (Venta a);
	public void borarr (Venta a);
	
	public List<Venta>consultar();
	
}
