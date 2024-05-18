public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("http://www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
