package com.agenda.app.AgendaBasica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Charo
 *
 */


/**
 * 
 * Arranque de la aplicación.
 *
 */
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
