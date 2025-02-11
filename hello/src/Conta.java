public class Conta {
    // atributos
    private String nome;
    private double saldo;
    //construtor
    public Conta (String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    // método depositar
    public void depositar(double valor){
        if (valor < 0) {
            throw new DepositoInvalidoException();
        }
        saldo += valor;
    }
    // método sacar
    public boolean sacar(double valor){
        if(valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;
    }
    public String toString(){
        return "conta de " + nome + " tem R$ " + saldo;
    }
}
