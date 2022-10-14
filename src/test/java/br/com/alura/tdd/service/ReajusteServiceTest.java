package br.com.alura.tdd.service;

import br.com.alura.tdd.builder.FuncionarioBuilder;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.tipo.Desempenho;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionarioRodrigo;

    @BeforeAll
    public static void antesDeTodosOsTestes() {
        System.out.println("ANTES DE TODOS OS TESTES");
    }

    @AfterAll
    public static void depoisDeTodosOsTestes() {
        System.out.println("DEPOIS DE TODOS OS TESTES");
    }

    @BeforeEach
    public void inicializar(){
        service = new ReajusteService();
        funcionarioRodrigo = FuncionarioBuilder.novo().salario("1000").build();
    }

    @Test
    void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        service.concederReajuste(funcionarioRodrigo, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionarioRodrigo.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
        service.concederReajuste(funcionarioRodrigo, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionarioRodrigo.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
        service.concederReajuste(funcionarioRodrigo, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionarioRodrigo.getSalario());
    }
}
