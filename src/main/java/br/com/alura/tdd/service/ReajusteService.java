package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.tipo.Desempenho;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionarioRodrigo, Desempenho desempenho) {
        funcionarioRodrigo.reajustarSalario(desempenho.percentualReajuste());
    }

}
