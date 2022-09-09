package com.prototype.testes;

import java.util.Objects;


public abstract class Veiculo {
	public String modelo;
	public String marca;
	public String cor;
	public int numeroRodas;
	
	public  Veiculo(){
	}
	
    public Veiculo(Veiculo adicionar) {
        if (adicionar != null) {
    		this.modelo = adicionar.modelo;
    		this.marca = adicionar.marca;
    		this.cor = adicionar.cor;
    		this.numeroRodas = adicionar.numeroRodas;	
        }
    }
    
    public abstract Veiculo clone();
    
    @Override
    public boolean equals(Object veiculo2) {
        if (!(veiculo2 instanceof Veiculo)) return false;
        Veiculo veiculoo2 = (Veiculo) veiculo2;
        return veiculoo2.modelo == modelo && veiculoo2.marca == marca && veiculoo2.cor == cor && Objects.equals(veiculoo2.numeroRodas, numeroRodas);
    }

}
