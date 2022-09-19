package com.decorator.teste;

public class Pepperoni extends Sanduichedecorator{
	
	public Pepperoni(FrangoAssado sando) {
		super(sando);
	}
	@Override
	public double informarPreco() {
		return super.informarPreco() + 0.99;
	}
	
	@Override
	public String informarIngredientes() {
		return super.informarIngredientes() + ", Pepperoni";
	}

}
