package test;



/*
 * @author: María Victoria
 */
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import control.AgendaController;

/*
 * Autowired es interpretado por Spring. El controlador es inyectado antes de que se ejecute el metodo del test
 */

@RunWith(SpringRunner.class)
@SpringBootTest

public class Pruebas {
	
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
	

}
