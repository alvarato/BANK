package com.pacoteck.springboot.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cuentas")
public class Cuenta {
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name="fecha_c")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	@Column(name="fecha_f")
	@Temporal(TemporalType.DATE)
	private Date fechaCierre;
	@Column(name="iban")
	private String iban;
	@Column(name="descripcion")
	private String descripcion;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "cuenta_titular",
			joinColumns =   { @JoinColumn(name = "cuenta_id")},
			inverseJoinColumns = {@JoinColumn(name = "titular_id")})
	private List<Titular> titulares = new ArrayList<>();

	public Cuenta() {}
	
	public Cuenta(Date fechaCreacion, String iban, String descripcion) {
		this.fechaCreacion = fechaCreacion;
		this.iban = iban;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Titular> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}
	
	
	
}
