package com.prototype.testes;


public class Camaro extends Veiculo{
	public int numeroPortas;
	public int velocidade;
	
	public Camaro() {
	}
	
	public Camaro(Camaro adicionar) {
		super(adicionar);
		if (adicionar != null) {
			this.numeroPortas = adicionar.numeroPortas;
			this.velocidade = adicionar.velocidade;
		}
	}
	
	@Override
	public Camaro clone(){
		return new Camaro(this);
	}
	
    @Override
    public boolean equals(Object veiculo2) {
        if (!(veiculo2 instanceof Camaro) || !super.equals(veiculo2)) return false;
        Camaro veiculoo2 = (Camaro) veiculo2;
        return veiculoo2.numeroPortas == numeroPortas && veiculoo2.velocidade == velocidade;
    }
}
