// Classe iPhone que implementa as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações dos métodos das interfaces

    @Override
    public void tocar() {
        // Lógica para tocar música
    }

    @Override
    public void pausar() {
        // Lógica para pausar música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Lógica para selecionar uma música específica
    }

    @Override
    public void ligar() {
        // Lógica para ligar o telefone
    }

    @Override
    public void atender() {
        // Lógica para atender uma chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        // Lógica para exibir uma página na internet
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Lógica para adicionar uma nova aba de navegação
    }

    @Override
    public void atualizarPagina() {
        // Lógica para atualizar a página exibida
    }
}