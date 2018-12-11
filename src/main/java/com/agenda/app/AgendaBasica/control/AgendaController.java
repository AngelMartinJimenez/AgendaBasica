package com.agenda.app.AgendaBasica.control;

/*
 * Construye el controlador de agenda basica para mvc
 * 
 * @author Ana 
 * */

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.agenda.app.AgendaBasica.modelo.Persona;
import com.agenda.app.AgendaBasica.servicios.IPersonaS;

@Controller
public class AgendaController {
	
		@Autowired
		private IPersonaS PersonaServicios;
		
		private static final Logger logger = LoggerFactory.getLogger(AgendaController.class);
		

		@RequestMapping("/")
		public ModelAndView handleRequest() throws Exception {
			logger.info("-- en Listado ASR");		
			List<Persona> listUsers = PersonaServicios.listPersons();
			logger.info("---"+listUsers);
			ModelAndView model = new ModelAndView("UserList");
			model.addObject("userList", listUsers);
			return model;
		}	
		
		@RequestMapping(value = "/new", method = RequestMethod.GET)
		public ModelAndView newUser() {
			logger.info("-- en NEW");
			ModelAndView model = new ModelAndView("UserForm");
			model.addObject("user", new Persona());
			return model;		
		}
		
		@RequestMapping(value = "/edit", method = RequestMethod.GET)
		public ModelAndView editUser(HttpServletRequest request) {
			logger.info("-- en EDIT");
			int userId = Integer.parseInt(request.getParameter("id"));
			Persona user = PersonaServicios.read(userId);
			ModelAndView model = new ModelAndView("UserForm");
			model.addObject("user", user);
			return model;		
		}
		
		@RequestMapping(value = "/delete", method = RequestMethod.GET)
		public ModelAndView deleteUser(HttpServletRequest request) {
			logger.info("-- en DELETE");
			int userId = Integer.parseInt(request.getParameter("id"));
			logger.info("----------" + userId +"---------------------");
			PersonaServicios.delete(userId);
			return new ModelAndView("redirect:/");		
		}
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public ModelAndView saveUser(@ModelAttribute Persona user) {
			logger.info("-- en SAVE");
			PersonaServicios.add(user);
			return new ModelAndView("redirect:/");
		}

		
	}
