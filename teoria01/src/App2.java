import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Conta[] contas = {
            new Conta("Isabela", 9999.99),
            new Conta("Professor", 9.99)
        };
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.print("\nNúmero da conta: ");
            int n = Integer.parseInt(entrada.nextLine());
            System.out.print("Valor a depositar: ");
            try {
                double valor = Double.parseDouble(entrada.nextLine());
                contas[n].depositar(valor);
                System.out.println(contas[n]);
            } catch(NumberFormatException ex) {
                System.out.println("Saldo deve ter somente números!");
            } catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println("Índices devem ser menores que " + contas.length);
            }
            
        }
    }
}
