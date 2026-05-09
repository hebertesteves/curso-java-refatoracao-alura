package hebertesteves.exercicio04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsuarioServiceTest {
    private ClienteApi clienteApi = mock(ClienteApi.class);
    private UsuarioService usuarioService = new UsuarioService(clienteApi);

    @Test
    public void deveRetornarNomeDoUsuario() {
        String nomeEsperado = "Hebert";

        when(clienteApi.buscarNome()).thenReturn(nomeEsperado);
        String nomeAtual = usuarioService.obterNomeUsuario();

        Assertions.assertEquals(nomeEsperado, nomeAtual);
    }
}
