package com.br.zup.candidatos;

public class Candidato {
	private int numero;
	private String nome = "";

	public Candidato(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {

		String candidato = "";
		candidato += "Nome: " + this.getNome() + "\n";
		candidato += "Numero: " + this.getNumero() + "\n";

		return candidato;
	}

}
