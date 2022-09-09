package com.prototype.testes;

import com.prototype.testes.Camaro;

import com.prototype.testes.Mustang;
import com.prototype.testes.Veiculo;

import java.util.ArrayList;
import java.util.List;


public class Aplicacao {
	public static void main(String[] args) {
	List<Veiculo> veiculo = new ArrayList<>();
    List<Veiculo> veiculocopia = new ArrayList<>();

    Camaro camaro = new Camaro();
    camaro.modelo = "chevrolet";
    camaro.marca = "camaro";
    camaro.cor = "preto";
    camaro.numeroRodas = 4;
    camaro.numeroPortas = 2;
    veiculo.add(camaro);

    Camaro addcamaro = (Camaro) camaro.clone();
    veiculo.add(addcamaro);

    Mustang mustang = new Mustang();
    mustang.modelo = "Mustang";
    mustang.marca = "black shadow";
    mustang.cor = "cinza";
    mustang.numeroRodas = 4;
    mustang.numeroPortas = 2;
    veiculo.add(mustang);
    
    clonagem(veiculo, veiculocopia);
    
	}
	
    private static void clonagem(List<Veiculo> veiculo, List<Veiculo> veiculocopia) {
        for (Veiculo veiculos : veiculo) {
        	veiculocopia.add(veiculos.clone());
        }
    
    for (int i = 0; i < veiculo.size(); i++) {
        if (veiculo.get(i) != veiculocopia.get(i)) {
            System.out.println(i + ": Diferete");
            if (veiculo.get(i).equals(veiculocopia.get(i))) {
                System.out.println(i + ": Igual");
            } else {
                System.out.println(i + ": Não é identico");
            }
        } else {
            System.out.println(i + ": Erro!");
        }
    }
}
}
    
    
