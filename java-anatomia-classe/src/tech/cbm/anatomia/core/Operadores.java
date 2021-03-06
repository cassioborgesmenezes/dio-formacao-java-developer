package tech.cbm.anatomia.core;

import java.util.logging.Logger;

public class Operadores {
	private static Logger logger = Logger.getLogger("Operadores");

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
		logger.info(concatenacao);

		concatenacao = 1+1+1+"1";
		logger.info(concatenacao);

		concatenacao = 1+"1"+1+1;
		logger.info(concatenacao);

		concatenacao = 1+"1"+1+"1";
		logger.info(concatenacao);

		concatenacao = "1"+1+1+1;
		logger.info(concatenacao);

		concatenacao = "1"+(1+1+1);
		logger.info(concatenacao);

		int numero = 5;
		
		//Imprimindo o numero negativo
		System.out.println(- numero);

		//incrementando numero em mais 1 numero, imprime 6
		numero++;
		System.out.println(numero);

		//incrementando numero em mais 1 numero, imprime 7
		System.out.println(numero++);// ops algo de errado não está certo

		System.out.println(numero);// agora sim, numero virou 7

		//ordem de precedencia conta aqui
		System.out.println(++numero);

		boolean verdadeiro = true;

		System.out.println("Inverteu " + !verdadeiro);

		// Operador ternario
		int a, b;

		a = 5;
		b = 6;

		String resultado = (a==b) ? "verdadeiro" : "falso";
		logger.info(resultado);

		// Operadores Relacionais
		int numero1 = 1;
        int numero2 = 2;
		boolean simNao = numero1 == numero2;

		logger.info("numero1 eh igual ao numero2? " + simNao);
		
		simNao = numero1 != numero2;
		logger.info("numero1 eh diferente de numero2? " + simNao);

		simNao = numero1 > numero2;
		logger.info("numero1 eh maior que numero2? " + simNao);

		simNao = numero1 < numero2;
		logger.info("numero1 eh menor que numero2? " + simNao);

	}
}
