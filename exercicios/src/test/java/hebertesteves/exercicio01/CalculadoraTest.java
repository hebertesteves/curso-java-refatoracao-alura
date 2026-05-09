package hebertesteves.exercicio01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarDoisNumerosCorretamente() {
        Calculadora calculadora = new Calculadora();

        int numero1 = 5;
        int numero2 = 3;
        int somaEsperada = 8;

        int somaAtual = calculadora.somar(numero1, numero2);

        Assertions.assertEquals(somaEsperada, somaAtual);
    }
}
