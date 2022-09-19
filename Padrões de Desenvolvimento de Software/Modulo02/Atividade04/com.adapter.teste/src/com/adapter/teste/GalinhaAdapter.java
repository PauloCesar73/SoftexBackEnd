package com.adapter.teste;

public class GalinhaAdapter extends Pato{

		private Galinha galinha;

		public GalinhaAdapter(Galinha galinha) {
			this.galinha = galinha;
		}

		public void cocorico() {
			galinha.cocoricoo();
	}
		public void voouu() {
			galinha.voar();
	}
}
