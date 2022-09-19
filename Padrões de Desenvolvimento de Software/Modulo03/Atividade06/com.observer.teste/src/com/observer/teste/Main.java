package com.observer.teste;

public class Main {
	public static void main(String[] args) {
		
		int newedition = 3;
		TextEditor text = new TextEditor();
		Editor editor = new Editor(text);

		text.setNovaEdicao(newedition);
	}
}
