package com.agenda.app.AgendaBasica;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AgendaBasicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaBasicaApplication.class, args);
		
		/*
		List <Persona> milista = new PersonaDAO().listPersons();
		
		for(Persona elemento : milista) {
			System.out.println(elemento.toString());
		}
		*/
		
		
		
		
		
	}
}
