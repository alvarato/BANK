package com.pacoteck.springboot.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private int pin;
	private Date fechaCreacion;
	private Date fehcaCierre;
	
	@ManyToOne
	private Cuenta cuenta;
	@ManyToOne
	private Titular titular;
	
	private int activo;
	private Double tasa;
	
	public Card() {}
	public Card(Long id, String number, int pin, Date fechaCreacion, Date fehcaCierre, Cuenta cuenta, Titular titular,
			    int activo, Double tasa) {
		this.id = id;
		this.number = number;
		this.pin = pin;
		this.fechaCreacion = fechaCreacion;
		this.fehcaCierre = fehcaCierre;
		this.cuenta = cuenta;
		this.titular = titular;
		this.activo = activo;
		this.tasa = tasa;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFehcaCierre() {
		return fehcaCierre;
	}
	public void setFehcaCierre(Date fehcaCierre) {
		this.fehcaCierre = fehcaCierre;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	public Double getTasa() {
		return tasa;
	}
	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", number=" + number + ", pin=" + pin + ", fechaCreacion=" + fechaCreacion
				+ ", fehcaCierre=" + fehcaCierre + ", activo=" + activo + ", tasa=" + tasa + "]";
	}
	
	
	
}
