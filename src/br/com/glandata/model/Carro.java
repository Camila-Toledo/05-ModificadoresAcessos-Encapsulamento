package br.com.glandata.model;

public class Carro {

	// Atributos da Classe
	private String marca;
	private int anoFabricacao;
	private String nome;
	private String cor;

	// Métodos da Classe
	public void ligar() {
		System.out.println("O carro ligou");
	}

	public String buzinar() {
		String somDaBuzina = "bi-biiiii";

		return somDaBuzina;
	}

	public void desligar() {
		System.out.println("O carro desligou");
	}

	public int somaNumeros(int numero1, int numero2) {
		int resultado = numero1 + numero2;

		return resultado;
	}

	public int somaNumeros(int numero1, int numero2, int numero3) {
		int resultado = numero1 + numero2 + numero3;

		return resultado;
	}

}
