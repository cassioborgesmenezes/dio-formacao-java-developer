package tech.cbm.dio.banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalController {
	private Cliente							cliente;
	private ContaCorrente					contaCorrente;

	public void getDadosFromTerminal() {
		if (cliente == null)
			cliente = new Cliente();

		if (contaCorrente == null)
			contaCorrente = new ContaCorrente();

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor digite o número da agência:");
		contaCorrente.setAgencia(scanner.next());

		System.out.println("Digite o número da conta corrente:");
		contaCorrente.setNumeroConta(scanner.nextInt());

		System.out.println("Digite o seu nome:");
		cliente.setNome(scanner.next());
		cliente.setSobrenome(scanner.next());

		contaCorrente.setCliente(cliente);

		scanner.reset();

		System.out.println("Qual o saldo da conta corrente?");
		contaCorrente.setSaldo(scanner.nextDouble());
	}

	public void printMessage() {
		String message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.02f já está disponível para saque", 
			cliente.getNomeCompleto(), contaCorrente.getAgencia(), contaCorrente.getNumeroConta(), contaCorrente.getSaldo());

		System.out.println(message);
	}
}
