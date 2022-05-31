package br.com.glandata.main;

import br.com.glandata.model.Carro;

public class TestaCarro {

	public static void main(String[] args) {

		Carro carroA = new Carro();

		carroA.ligar();

		System.out.println(carroA.buzinar());

		System.out.println("Soma dois números:" + carroA.somaNumeros(5, 15));

		System.out.println("Soma três números:" + carroA.somaNumeros(5, 5, 5));

		carroA.desligar();
	}

}
