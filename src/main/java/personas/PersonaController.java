package personas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PersonaController {
	@GetMapping("/saludar/{nombre}")
	public String saludar(@PathVariable String nombre ) {
		log.warn("valor ingresado:" + nombre);
		
		return "hola"+ nombre;
		}
}
