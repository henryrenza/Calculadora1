package com.henry.servicorest;

public class Suma {
	
	private double num1, num2, resultado;
	
	public Suma(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
		resultado=num1+num2;
	}
	
	public double sumar (double num1, double num2) {
		resultado=num1+num2;
		return resultado;
	}

	public double getNum2() {
		return num2;
	}

	public double getNum1() {
		return num1;
	}



}
