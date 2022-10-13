package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import br.com.alura.tdd.tipo.Desempenho;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    @Test
    void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionarioRodrigo = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(funcionarioRodrigo, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionarioRodrigo.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionarioRodrigo = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(funcionarioRodrigo, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionarioRodrigo.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionarioRodrigo = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(funcionarioRodrigo, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionarioRodrigo.getSalario());
    }

}
