package hebertesteves.exercicio02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioServiceTest {

    @Test
    public void deveValidarUmMaiorDeIdadeCorretamente() {
        UsuarioService usuarioService = new UsuarioService();

        int idade = 20;
        boolean maiorDeIdadeAtual = usuarioService.maiorDeIdade(idade);

        Assertions.assertTrue(maiorDeIdadeAtual);
    }

    @Test
    public void deveValidarUmMenorDeIdadeCorretamente() {
        UsuarioService usuarioService = new UsuarioService();

        int idade = 15;
        boolean menorDeIdadeAtual = usuarioService.maiorDeIdade(idade);

        Assertions.assertFalse(menorDeIdadeAtual);
    }
}
