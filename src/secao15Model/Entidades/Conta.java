package secao15Model.Entidades;

import secao15Model.exceptions.DomainExceptions;

public class Conta {
	
	private Integer numero;
	private String usuario;
	private Double saldo;
	private Double limitSaque;
	
	
	public Conta(Integer numero, String usuario, Double saldo, Double limitSaque) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
		this.limitSaque = limitSaque;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double getLimitSaque() {
		return limitSaque;
	}


	public void setLimitSaque(Double limitSaque) {
		this.limitSaque = limitSaque;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor ) {
		if (valor > limitSaque) {
			throw new DomainExceptions("O Valor é maior que o limite permitido !");
		}
		if (valor > saldo ) {
			throw new DomainExceptions("Saldo Insuficiente ! ");
		}
		saldo -= valor;
	}

}
