package hebertesteves.exercicio03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaudacaoServiceTest {

    @Test
    public void deveGerarUmaMensagemCorretamente() {
        SaudacaoService saudacaoService = new SaudacaoService();
        String mensagemEsperada = "Olá Hebert";

        String nome = "Hebert";
        String mensagemAtual = saudacaoService.gerarMensagem(nome);

        Assertions.assertEquals(mensagemEsperada, mensagemAtual);
    }
}
