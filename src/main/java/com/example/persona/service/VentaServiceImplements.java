package com.example.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persona.entity.Venta;
import com.example.persona.rerpository.VentaRepository;
@Service
public class VentaServiceImplements implements VentaService {
	@Autowired
	VentaRepository x;

	@Override
	public Venta registrar(Venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Venta actualizar(Venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void borarr(Venta a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Venta> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
	

}
