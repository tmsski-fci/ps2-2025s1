import java.util.Scanner;
import static java.lang.System.out;

public class Ihm {
    private GerenciadorNomes g;
    private Scanner entrada = new Scanner(System.in);
    public Ihm(GerenciadorNomes g){
        this.g = g;
    }
    public void dialogar(){
        out.println("GERENCIADOR DE NOMES");
        boolean sair = false;
        while (!sair){
            out.println("\nEscolha uma das opções:");
            out.println("(1) Listar todos os nomes");
            out.println("(2) Adicionar nome");
            out.println("(3) Sair");
            int opcao = Integer.parseInt(entrada.nextLine());
            switch (opcao){
                case 1: listar(); break;
                case 2: adicionar(); break;
                case 3: sair = true; break;
                default: out.println("Opção Inválida");
            }
        }
        out.println("Fim do programa");
    }
    private void listar(){
        out.println("\nNomes cadastrados: ");
        out.println(g.obterNomes());
    }
    private void adicionar(){
        out.print("\nNome a ser adicionado: ");
        String nome = entrada.nextLine();
        g.adicionarNome(nome);
        out.println("Nome cadastrado com sucesso");
    }
}
