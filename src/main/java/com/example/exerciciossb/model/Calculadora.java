package com.example.exerciciossb.model;

public class Calculadora {

	int num1;
	int num2;
	
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int soma() {
		return num1 + num2;
	}
	
	public int subt() {
		return num1 - num2;
	}
}
