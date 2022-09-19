package com.decorator.teste;

public class QueijoMussarelaRalado extends Sanduichedecorator{
	public QueijoMussarelaRalado(FrangoAssado sando) {
		super(sando);
	}
	@Override
	public double informarPreco() {
		return super.informarPreco() + 2.00;
	}
	
	@Override
	public String informarIngredientes() {
		return super.informarIngredientes() + ", Mussarela Ralada";
	}
}
