package hebertesteves.exercicio04;

public class UsuarioService {
    private ClienteApi clienteApi;

    public UsuarioService(ClienteApi clienteApi) {
        this.clienteApi = clienteApi;
    }

    public String obterNomeUsuario() {
        return clienteApi.buscarNome();
    }
}
