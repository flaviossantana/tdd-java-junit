package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private final String nome;
	private final LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public void reajustarSalario(BigDecimal percentual) {
		this.salario = this.salario.add(obterReajsute(percentual));
	}

	private BigDecimal obterReajsute(BigDecimal percentual) {
		return  this.salario.multiply(percentual);
	}
}
