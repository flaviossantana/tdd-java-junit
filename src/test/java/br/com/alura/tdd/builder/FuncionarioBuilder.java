package br.com.alura.tdd.builder;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioBuilder {

    private static final Funcionario funcionario = new Funcionario("Rodrigo Santos", LocalDate.now(), BigDecimal.ZERO);

    public static FuncionarioBuilder novo() {
        return new FuncionarioBuilder();
    }

    public FuncionarioBuilder salario(String salario) {
        funcionario.setSalario(new BigDecimal(salario));
        return this;
    }

    public Funcionario build() {
        return funcionario;
    }

}
