package br.inf.digidados.luiz.livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		double soma = livroJava8 + livroTDD;
		System.out.println("O total de estoque �: " + soma);
		if (soma < 150) {
			System.out.println("O seu estoque est� muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("O seu estoque est� muito alto!");
		} else {
			System.out.println("O seu estoque est� bom!");
		}
	}
}
