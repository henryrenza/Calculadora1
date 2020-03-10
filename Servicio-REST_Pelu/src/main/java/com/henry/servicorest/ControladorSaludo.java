package com.henry.servicorest;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorSaludo {

	private static final String template = "Hola, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/saludo")
	public Saludo saludo(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return new Saludo(counter.incrementAndGet(), String.format(template, name));
	}
	
	
	@GetMapping("/suma")//SUMAAAAAA
	public Operaciones suma(@RequestParam(value = "num1", defaultValue = "1") String num1, 
			@RequestParam(value = "num2", defaultValue = "1") String num2) {
		return new Operaciones(Double.parseDouble(num1), Double.parseDouble(num2),0);
	}


	
	@GetMapping("/resta")
	public Operaciones resta(@RequestParam(value = "num1", defaultValue = "1") String num1, 
			@RequestParam(value = "num2", defaultValue = "1") String num2) {
		return new Operaciones (Double.parseDouble(num1), Double.parseDouble(num2),1);
	}
	
	@GetMapping("/multiplicacion")
	public Operaciones multiplicacion(@RequestParam(value = "num1", defaultValue = "1") String num1, 
			@RequestParam(value = "num2", defaultValue = "1") String num2) {
		return new Operaciones(Double.parseDouble(num1), Double.parseDouble(num2),2);
	}
	
	@GetMapping("/division")
	public Operaciones division(@RequestParam(value = "num1", defaultValue = "1") String num1, 
			@RequestParam(value = "num2", defaultValue = "1") String num2) {
		return new Operaciones(Double.parseDouble(num1), Double.parseDouble(num2),3);
	}
}


	
	

	
	