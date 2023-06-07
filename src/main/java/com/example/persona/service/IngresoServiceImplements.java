package com.example.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persona.entity.Ingreso;
import com.example.persona.rerpository.IngresoRepository;
@Service
public class IngresoServiceImplements implements IngresoService {
	@Autowired
	IngresoRepository x;

	@Override
	public Ingreso registrar(Ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Ingreso actualizar(Ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Ingreso a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ingreso> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
