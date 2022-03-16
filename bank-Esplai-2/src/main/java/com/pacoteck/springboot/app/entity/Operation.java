package com.pacoteck.springboot.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int amount;
	@ManyToOne
	private Cuenta cuenta;
	@ManyToOne
	private Card card;
	
	private int Categoria;
	@Temporal(TemporalType.DATE)
	private Date fecha;
}
