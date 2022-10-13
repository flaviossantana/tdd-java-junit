package br.com.alura.tdd.modelo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {

    @Test
    void criarFuncionarioPeloContrutor() {
        Funcionario funcionario = new Funcionario("Rodrigo", LocalDate.now(), BigDecimal.ZERO);
        assertEquals("Rodrigo", funcionario.getNome());
        assertEquals(LocalDate.now(), funcionario.getDataAdmissao());
        assertEquals(BigDecimal.ZERO, funcionario.getSalario());
    }


}
