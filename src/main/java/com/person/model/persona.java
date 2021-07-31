package com.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_persona;
	@Column
	private String cedula;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;
	@Column
	private String correo;
	
	public persona() {

	}
	public persona(String cedula, String nombre, String apellido, String telefono, String correo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public long getId_persona() {
		return id_persona;
	}
	public void setId_persona(long id_persona) {
		this.id_persona = id_persona;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
