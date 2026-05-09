package br.com.alura.service;

import br.com.alura.client.ClientHttpConfiguration;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.http.HttpResponse;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class PetServiceTest {
    ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
    HttpResponse<String> response = mock(HttpResponse.class);

    @Test
    public void deveVerificarSeDispararRequisicaoPostSeraChamado() throws IOException, InterruptedException {
        String userInput = "Teste\npets.csv\n";

        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        PetService petService = new PetService(client);

        when(client.dispararRequisicaoPost(anyString(), any())).thenReturn(response);

        petService.importarPetsDoAbrigo();
        verify(client, atLeast(1))
                .dispararRequisicaoPost(anyString(), any());
    }
}
