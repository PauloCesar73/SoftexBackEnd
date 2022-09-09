package com.prototype.testes;

public class Mustang extends Veiculo{
	public int numeroPortas;
	public int velocidade;
	
	public Mustang() {
	}
	
	public Mustang(Mustang adicionar) {
		super(adicionar);
		if (adicionar != null) {
			this.numeroPortas = adicionar.numeroPortas;
			this.velocidade = adicionar.velocidade;
		}
	}
	
	@Override
	public Mustang clone(){
		return new Mustang(this);
	}
	
    @Override
    public boolean equals(Object veiculo2) {
        if (!(veiculo2 instanceof Mustang) || !super.equals(veiculo2)) return false;
        Mustang veiculoo2 = (Mustang) veiculo2;
        return veiculoo2.numeroPortas == numeroPortas && veiculoo2.velocidade == velocidade;
    }
}
