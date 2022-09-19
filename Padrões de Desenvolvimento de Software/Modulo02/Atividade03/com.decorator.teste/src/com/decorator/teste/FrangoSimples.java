package com.decorator.teste;

public class FrangoSimples implements FrangoAssado{
	

	@Override
	public double informarPreco() {
		return 4.50;
	}
	@Override
	public String informarIngredientes() {
		return "Sanduíche de frango assado";
	
	}
}