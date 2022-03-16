package com.pacoteck.springboot.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="titulares")
public class Titular {
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="dni")
	private String dni;
	@Column(name="name")
	private String name;
	@Column(name="name2")
	private String name2;
	@Column(name="last_name")
	private String lastName;
	@Column(name="last_name2")
	private String lastName2;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="adress")
	private String adress;
	@Column(name="postal_code")
	private short postalCode;
	
	@Column(name="fecha_n")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name="fehcai")
	@Temporal(TemporalType.DATE)
	private Date fechaApertura;
	
	//@ManyToMany(fetch = FetchType.LAZY, mappedBy = "titulares")
	//private Set<Cuenta> cuentas = new HashSet();
	
	public Titular() {}
	
	public Titular(Long id, String dni, String name, String name2,
			String lastName, String lastName2, String password,
			String email, String adress, short postalCode, Date fechaNacimiento, 
			Date fechaApertura) {
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.name2 = name2;
		this.lastName = lastName;
		this.lastName2 = lastName2;
		this.password = password;
		this.email = email;
		this.adress = adress;
		this.postalCode = postalCode;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaApertura = fechaApertura;
		//this.cuentas = cuentas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public short getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(short postalCode) {
		this.postalCode = postalCode;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	//public Set<Cuenta> getCuentas() {
		//return cuentas;
	//}

	//public void setCuentas(Set<Cuenta> cuentas) {
		//this.cuentas = cuentas;
	//}

	
	
}
