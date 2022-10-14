package br.com.alura.tdd.modelo;

import br.com.alura.tdd.builder.FuncionarioBuilder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {

    @Test
    void criarFuncionarioPeloContrutor() {
        Funcionario funcionario = FuncionarioBuilder
                .novo()
                .salario("0")
                .build();

        assertEquals("Rodrigo Santos", funcionario.getNome());
        assertEquals(LocalDate.now(), funcionario.getDataAdmissao());
        assertEquals(BigDecimal.ZERO, funcionario.getSalario());
    }


}
