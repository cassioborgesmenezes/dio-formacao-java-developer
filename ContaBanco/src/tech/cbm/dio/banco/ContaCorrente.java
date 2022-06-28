package tech.cbm.dio.banco;

public class ContaCorrente {
	private int					numeroConta;
	private String				agencia;
	private Cliente				cliente;
	private double				saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", cliente=" + cliente + ", numeroConta=" + numeroConta
				+ ", saldo=" + saldo + "]";
	}

}
