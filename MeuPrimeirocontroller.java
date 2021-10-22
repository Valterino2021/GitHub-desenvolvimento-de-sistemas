package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class MeuPrimeirocontroller {
	
	
	@GetMapping ("hello")
	@ResponseBody
	public String hello() {
		
		return "oi!";
	}
/*"como definir um beans--------------"*/
}
