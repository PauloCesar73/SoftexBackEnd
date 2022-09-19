package com.observer.teste;

import java.util.Observable;
import java.util.Observer;

public class Editor implements Observer{
	Observable textoo;

	int edicaonew;

	public Editor(Observable texto) {
		this.textoo = texto;
		textoo.addObserver(this);
	}

	@Override
	public void update(Observable textInfSubject, Object arg1) {
		if  (textInfSubject instanceof TextEditor) {
			TextEditor texteditor = (TextEditor) textInfSubject;
			edicaonew = texteditor.getEdicao();
			System.out.println(edicaonew);
		}
	}
}
