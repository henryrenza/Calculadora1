package com.henry.servicorest;

public class Operaciones {
	
	private final double num1, num2;
	private double resultado;
	private final int operacion;
	
	public Operaciones(double num1, double num2, int operacion) {
		this.num1 = num1;
		this.num2 = num2;
		this.operacion = operacion;
	}
	
	public double getNum1() {
		return num1;
	}
	public double getNum2() {
		return num2;
	}
	
	public int getOperacion() {
		return operacion;
	}
	
	
	public String getResultado() {
		switch (operacion) {
		case 0:
			resultado = num1+num2;
			return " "+resultado;
		case 1:
			resultado = num1-num2;
			return ""+resultado;
		case 2:
			resultado = num1*num2;
			return ""+resultado;
		case 3:
			resultado = num1/num2;
			return ""+resultado;

		}
		return "No hay opción";
		
	}

}
	


	