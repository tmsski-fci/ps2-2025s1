import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;
public class App {
    private static Scanner entrada = new Scanner(System.in);
    private static ObjetoDados objDados = null;
    private static void consultar() throws Exception {
        List<Conta> contas = objDados.obterContas();
        out.println("\n# Lista de contas:");
        for (Conta c: contas) {
            out.println(c);
        }
    }
    private static void adicionar() throws Exception {
        out.println("\n# Adição de nova conta!");
        out.print("Número da nova conta: ");
        long n = Long.parseLong(entrada.nextLine());
        out.print("Saldo da nova conta: ");
        double s = Double.parseDouble(entrada.nextLine());
        Conta c = new Conta(n, s);
        boolean sucesso = objDados.adicionar(c);
        if (sucesso) {
            out.println("# Conta criada com sucesso!");
        }
        else {
            out.println("# Problema ao tentar criar a conta!");
        }
    }
    private static void apagar() throws Exception {
        out.println("\n# REMOÇÃO DE CONTA");
        out.print("Número da conta a ser apagada: ");
        long numero = Long.parseLong(entrada.nextLine());
        boolean sucesso = objDados.apagar(numero);
        if (sucesso) {
            out.println("# Conta apagada!");
        }
        else {
            out.println("# Problema ao tentar apagar a conta!");
        }
    }
    private static void alterar() throws Exception {
        out.println("\n# ALTERAÇÃO DE CONTA");
        out.print("Número da conta a ser alterada: ");
        long numero = Long.parseLong(entrada.nextLine());
        out.print("Novo saldo da conta: ");
        double saldo = Double.parseDouble(entrada.nextLine());
        Conta c = new Conta(numero, saldo);
        boolean sucesso = objDados.atualizar(c);
        if (sucesso) {
            out.println("# Conta alterada!");
        }
        else {
            out.println("# Falha ao alterar a conta!");
        }
    }
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.omnrwovhmuricmmikesv&password=mydb1234!@#$";
        objDados = new ObjetoDados(url);
        boolean sair = false;
        while (!sair) {
            out.println("\n# GERENCIADOR DE CONTAS");
            out.println("(1) Consultar contas");
            out.println("(2) Adicionar conta");
            out.println("(3) Alterar conta");
            out.println("(4) Apagar conta");
            out.println("(9) Sair");
            out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());
            switch (opcao) {
                case 1: consultar(); break;
                case 2: adicionar(); break;
                case 3: alterar(); break;
                case 4: apagar(); break;
                case 9: sair = true; break;
                default: 
                    out.println("\n# Opção inválida!");
            }
        }        
        out.println("# Fim do programa!");
    }
}
