package com.strategy.teste;

public class Calcular {
  
  public Strategy calcular;
	
	public void Operacao(int n1, int n2) {
		System.out.println(calcular.execute(n1, n2));
	}

}
