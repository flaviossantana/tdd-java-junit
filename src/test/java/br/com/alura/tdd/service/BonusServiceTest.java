package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {

    private Funcionario funcionarioRodrigo;

    void criarFuncionarioComSalario(BigDecimal salario) {
        funcionarioRodrigo = new Funcionario("Rodrigo", LocalDate.now(), salario);
    }

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService service = new BonusService();
        criarFuncionarioComSalario(new BigDecimal("25000"));

        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(funcionarioRodrigo));
    }

    @Test
    void bonusDeveriaSerDezPorCentoDoSalario() {
        BonusService service = new BonusService();
        criarFuncionarioComSalario(new BigDecimal("2500"));
        BigDecimal bonus = service.calcularBonus(funcionarioRodrigo);
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
        BonusService service = new BonusService();
        criarFuncionarioComSalario(new BigDecimal("10000"));
        BigDecimal bonus = service.calcularBonus(funcionarioRodrigo);
        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}
