package com.strategy.teste;

public class Soma implements Strategy{
      public int execute(int n1, int n2) {
        
        int resultado = n1+n2;
        return resultado;
    }
}
