package com.decorator.teste;

public class Main {
	public static void imprimirInfo(FrangoAssado sa) {
		System.out.println("Preço: " + sa.informarPreco() + ", Ingredientes: " + sa.informarIngredientes());
	}
	
	public static void main(String[] args) {
		FrangoAssado sa = new FrangoSimples();
		imprimirInfo(sa);
	
		sa = new Pepperoni(sa);
		imprimirInfo(sa);
		
		sa = new FrangoSimples();
		sa = new Pepperoni(sa);
		sa = new QueijoMussarelaRalado(sa);
		imprimirInfo(sa);
	}
}
