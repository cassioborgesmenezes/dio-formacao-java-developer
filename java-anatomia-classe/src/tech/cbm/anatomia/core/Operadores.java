package tech.cbm.anatomia.core;

public class Operadores {
	// atribuicoes
	String nome = "GLEYSON";
	int idade = 22;
	double peso = 68.5;
	char sexo = 'M';
	boolean doadorOrgao = false;
	//Date dataNascimento = new Date();

	// operadores aritmeticos
	double soma = 10.5 + 15.7;
	int subtração = 113 - 25;
	int multiplicacao = 20 * 7;
	int divisao = 15 / 3;
	int modulo = 18 % 3;
	double resultado = (10 * 7) + (20/4);

	public static void main(String[] args) {
		String concatenacao ="?";
		System.out.println(concatenacao);

		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);

		concatenacao = "1"+1+1+1;
		System.out.println(concatenacao);

		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);
	}
}
