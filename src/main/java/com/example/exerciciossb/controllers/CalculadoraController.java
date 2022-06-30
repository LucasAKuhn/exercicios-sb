package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.Calculadora;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{num1}/{num2}")
	public int somar(@PathVariable int num1, @PathVariable int num2) {
		return num1 + num2;
	}
	
	//http://localhost:8080/calculadora/subtrair?a=100&b=39
	@GetMapping("/subtrair")
	public int subtrair(
			@RequestParam(name = "a") int a,
			@RequestParam(name = "b") int b) {
	
		return a - b;	
	}

}