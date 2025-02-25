public class App1 {
    public static void main(String[] args) {
        GerenciadorNomes g = new GerenciadorNomesMem();
        g.adicionarNome("Marcelo");
        g.adicionarNome("Silvia");
        System.out.println(g.obterNomes());
    }
}