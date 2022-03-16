package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pacoteck.springboot.app.entity.Cuenta;
import com.pacoteck.springboot.app.repository.CuentaRepository;

@Service
public class CuentaService {

	@Autowired
	public CuentaRepository cuentaRepository;
	
	
	public List<Cuenta> findAll(){
		return cuentaRepository.findAll();
	}
	
	public void save(Cuenta cuenta) {
		cuentaRepository.save(cuenta);
	}
	
	public void delete(Cuenta cuenta) {
		cuentaRepository.delete(cuenta);
	}
}
