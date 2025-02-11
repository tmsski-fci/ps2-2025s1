import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***********");
        System.out.println("Bem-vindos!");
        System.out.println("***********");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome do correntista: ");
        String nome = entrada.nextLine();
        boolean sucesso = false;
        while(!sucesso) {
            System.out.print("Digite o saldo: ");
            try {
                double saldo = Double.parseDouble(entrada.nextLine());
                sucesso = true;
                Conta c = new Conta(nome, saldo);
                System.out.println(c);
            } catch(NumberFormatException ex) {
                System.out.println("O saldo deve ser digitado apenas com algarismos numéricos!");
                System.out.println("Mensagem da exceção: " + ex.getMessage());
            }
        }
        System.out.println("Fim do programa!");
    }
}
