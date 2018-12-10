package com.agenda.app.AgendaBasica;

/*
 * @author: María victoria
 */
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.agenda.app.AgendaBasica.control.AgendaController;

/*
 * Autowired es interpretado por Spring. El controlador es inyectado antes de que se ejecute el metodo del test
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaBasicaApplicationTests {

	 @Autowired
	private AgendaController controller;
	 
	@Test
	
	 public void testAutowired() throws Exception {
    	//Como la primera es falsa y es un assert, no sigue a la segunda
    	//assertThat("asdasd").asList();
        assertThat(controller).isNotNull();
        
        //Para asegurar que falla elimina la linea del controlador
        //    @Controller
    }

	 @Test
	    public void contextLoads() throws Exception {
	    	//Deberia fallar
	    	assertThat(false).isFalse();
	    }
	 
	 


	@RunWith(SpringRunner.class)
	@WebMvcTest
	public class ApplicationTest05_webLayer {


	    @Autowired
	    private MockMvc mockMvc;

	    @Test
	    public void webLayer() throws Exception {
	        this.mockMvc
	        .perform(get("/"))
	        .andDo(print())
	        .andExpect(status().isOk())
	        .andExpect(content().string(containsString("Hello World")));
	    }

	}
}
