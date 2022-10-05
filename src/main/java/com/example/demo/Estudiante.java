package com.example.demo;

import java.time.LocalDate;

public class Estudiante {
String nom;
String apellido;
LocalDate fecha;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
@Override
public String toString() {
	return "clientecontroller [nom=" + nom + ", apellido=" + apellido + ", fecha=" + fecha + "]";
}
public Estudiante(String nom, String apellido, LocalDate fecha) {
	super();
	this.nom = nom;
	this.apellido = apellido;
	this.fecha = fecha;
}
}
