package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pacoteck.springboot.app.entity.Titular;
import com.pacoteck.springboot.app.repository.TitularRepository;


@Service
public class TitularService {
	
	@Autowired
	public TitularRepository titularRepository;
	
	public List<Titular> findAll(){
		return titularRepository.findAll();
	}
	public void save(Titular titular) {
		titularRepository.save(titular);
	}
	
	public void delete(Titular titular) {
		titularRepository.delete(titular);
	}
	
}
