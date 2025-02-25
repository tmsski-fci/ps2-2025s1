public class AppGerenciador {
    public static void main(String[] args) {
        GerenciadorNomes gn = new GerenciadorNomesMem();
        Ihm ihm = new Ihm(gn);

        ihm.dialogar();
    }
}