package cl.dramos.pruebas.springboot.saludos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@Api(value="Saludos", description="operaciones de saludos")
@RestController
public class SaludosResource {
		
	@ApiOperation(value = "View a list of available products",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping("/saludos")
	public String getHolaMundo() {
		return "hola!, entraste por GET al método getHolaMundo";
	}
    
    @GetMapping("/saludos/{nombre}")
    public String saludar(@PathVariable("nombre") String nombre) {
    	return "Hola " + nombre + "!, entraste por GET al método saludar";
    }
    
    @PostMapping("/saludos/{nombre}")
    public String crearSaludo(@RequestBody String nombre) {
    	return "Hola " + nombre + "!, entraste por POST al método crearSaludo.";
    }


}




