package com.decorator.teste;

public abstract class Sanduichedecorator implements FrangoAssado{
	private final FrangoAssado sanduiche;
	
	public Sanduichedecorator(FrangoAssado sando) {
		this.sanduiche = sando;
	}
	@Override
	public double informarPreco() {
		return sanduiche.informarPreco();
	}
	@Override
	public String informarIngredientes() {
		return sanduiche.informarIngredientes();
	}
	public FrangoAssado getSand() {
		return sanduiche;
	}
}
