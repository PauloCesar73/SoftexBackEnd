package com.observer.teste;

import java.util.Observable;
import java.util.Observer;

public class TextEditor extends Observable{
	
	private int edicao;
	
	public void setNovaEdicao(int novaEdicao) {
		this.edicao = novaEdicao;

		setChanged();
		notifyObservers();
	}

	public int getEdicao() {
		return this.edicao;
	}

}
