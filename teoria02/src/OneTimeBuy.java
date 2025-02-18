public class OneTimeBuy extends Jogo {
    public OneTimeBuy (String nome, String tipo, double valor){
        super (nome, tipo, valor);
    }
    @Override
    public void cobrar() {
        System.out.println(" Enviando cobrança para seu cartão de crédito.");
        System.out.println("Dados do jogo adquirido: ");
        System.out.println(super.toString());
    }
    
}
