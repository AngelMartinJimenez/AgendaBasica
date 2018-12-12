package com.agenda.app.AgendaBasica;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.agenda.app.AgendaBasica.control.AgendaController;
import com.agenda.app.AgendaBasica.control.AgendaRestController;


@RunWith(SpringRunner.class)
@SpringBootTest

public class AgendaBasicaApplicationTestRest {
	
	 @Autowired
		private AgendaRestController controller;
	
	 @Test
	    public void contextLoads() throws Exception {
	    	//Deberia fallar si pones True
	    	assertThat(false).isFalse();
	    }

}
