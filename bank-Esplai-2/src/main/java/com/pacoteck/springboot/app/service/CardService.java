package com.pacoteck.springboot.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.entity.Card;
import com.pacoteck.springboot.app.entity.Cuenta;
import com.pacoteck.springboot.app.entity.Titular;
import com.pacoteck.springboot.app.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	public CardRepository cardRepository;
	
	public List<Card> findALL(){
		 return cardRepository.findAll();

	}
	
	public void save(Card card) {
		cardRepository.save(card);
	}
	
	public void delete(Card card) {
		cardRepository.delete(card);
	}
	
}

