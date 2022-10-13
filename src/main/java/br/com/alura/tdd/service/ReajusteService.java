package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.tipo.Desempenho;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionarioRodrigo, Desempenho desempenho) {
        if (desempenho == Desempenho.A_DESEJAR) {
            funcionarioRodrigo.reajustarSalario(new BigDecimal("0.03"));
        } else if (desempenho == Desempenho.BOM) {
            funcionarioRodrigo.reajustarSalario(new BigDecimal("0.15"));
        } else {
            funcionarioRodrigo.reajustarSalario(new BigDecimal("0.20"));
        }
    }

}
