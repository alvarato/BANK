package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.entity.Card;
import com.pacoteck.springboot.app.entity.Cuenta;
import com.pacoteck.springboot.app.entity.Titular;
import com.pacoteck.springboot.app.service.CardService;
import com.pacoteck.springboot.app.service.CuentaService;
import com.pacoteck.springboot.app.service.TitularService;

@RestController
@RequestMapping(value = "/controller")
public class Controller {
	
	@Autowired
	public TitularService titularService;
	
	@Autowired
	public CardService cardService;
	
	@Autowired
	public CuentaService cuentaService;
	
	@GetMapping(value = "/card")
	public List<Card> tarjetas(){
		return cardService.findALL();	
	}
	@PostMapping(value = "/card")
	public void saveCards(@RequestBody Card card){
		 cardService.save(card);	
	}
	@DeleteMapping(value = "/card")
	public void deletecard(@RequestBody Card card) {
		cardService.delete(card);
	}
	
	@GetMapping(value = "/titulares")
	public List<Titular> listar(){
		return titularService.findAll();
	}
	@PostMapping(value = "/titulares")
	public void saveTitular(@RequestBody Titular titular){
		 titularService.save(titular);	
	}
	@DeleteMapping(value = "/titulares")
	public void deleteTitular(@RequestBody Titular titular) {
		titularService.delete(titular);
	}
	@GetMapping(value = "/cuentas")
	public List<Cuenta> cuentas(){
		return cuentaService.findAll();
	}
	@PostMapping(value = "/cuentas")
	public void saveCuenta(@RequestBody Cuenta cuenta){
		 cuentaService.save(cuenta);	
	}
	@DeleteMapping(value = "/cuentas")
	public void deleteCuenta(@RequestBody Cuenta cuenta) {
		cuentaService.delete(cuenta);
	}
	
}
