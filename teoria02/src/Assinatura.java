public class Assinatura extends Jogo {
    private String plano;
    public Assinatura (String nome, String tipo, double valor, String plano){
        super (nome, tipo, valor);
        this.plano = plano;
    }
    @Override
    public void cobrar() {
        System.out.println("Programando cobrança mensal no cartão.");
        System.out.println("Dados do serviço adquirido: ");
        System.out.println(super.toString());
        System.out.println("Plano " + plano);
    }
    public String getPlano() {
        return plano;
    }
}
