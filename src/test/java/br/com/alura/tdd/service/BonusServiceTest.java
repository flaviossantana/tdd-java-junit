package br.com.alura.tdd.service;

import br.com.alura.tdd.builder.FuncionarioBuilder;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {

    private Funcionario funcionarioRodrigo;

    @BeforeEach
    public void criarFuncionarioComSalario() {
        funcionarioRodrigo = FuncionarioBuilder.novo().build();
    }

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService service = new BonusService();
        funcionarioRodrigo.setSalario(BigDecimal.valueOf(25000));
        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(funcionarioRodrigo));
    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario() {
        BonusService service = new BonusService();
        funcionarioRodrigo.setSalario(BigDecimal.valueOf(2500));
        BigDecimal bonus = service.calcularBonus(funcionarioRodrigo);
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
        BonusService service = new BonusService();
        funcionarioRodrigo.setSalario(BigDecimal.valueOf(10000));
        BigDecimal bonus = service.calcularBonus(funcionarioRodrigo);
        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}
