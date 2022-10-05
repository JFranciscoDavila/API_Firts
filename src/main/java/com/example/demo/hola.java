package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hola {
	 @GetMapping("hola")
	    public String bonaTarda() {
	        return "bona tarda";
	 }
	 
	 @GetMapping("Alumno")
	    public Estudiante getClient() {
		 return new Estudiante("joan", "petit", LocalDate.now());
	 }
	 
	 
	 @GetMapping("alumnos")
	 public List<Estudiante>getEstudiante(){
		 ArrayList<Estudiante>Estudiantes=new ArrayList<>();
		 Estudiantes.add(new Estudiante("pera", "petit", null));
		 Estudiantes.add(new Estudiante("juanma", "grand", null));
		 Estudiantes.add(new Estudiante("marione", "basaisai", null));
		 Estudiantes.add(new Estudiante("juan carlos", "abuacay", null));
		 Estudiantes.add(new Estudiante("miguel", "urdaneta", null));
		return Estudiantes;
		 
	 }
	 
}
