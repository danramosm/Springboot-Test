package cl.dramos.pruebas.springboot.recursos;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludosResource {
	
    @RequestMapping(method = RequestMethod.GET, value = "/saludos",produces = MediaType.APPLICATION_JSON_VALUE)

	public String getHolaMundo() {
		return "hola!, entraste por GET al método getHolaMundo";
	}
    
    @RequestMapping(method = RequestMethod.GET, value = "/saludos/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String saludar(@PathVariable("nombre") String nombre) {
    	return "Hola " + nombre + "!, entraste por GET al método saludar";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/saludos", produces = MediaType.APPLICATION_JSON_VALUE)
    public String crearSaludo(@RequestBody String saludo) {
    	return "Hola " + saludo + "!, entraste por POST al método crearSaludo.";
    }

}
