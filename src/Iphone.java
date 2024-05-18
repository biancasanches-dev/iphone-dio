public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico {

    public void tocar() {
        System.out.println("Tocando" );
    }
    public void pausar() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
    public void exibirPagina(String url) {
        System.out.println("Acessando: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }
    public void atender() {
        System.out.println("Ligação Atendida");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
}