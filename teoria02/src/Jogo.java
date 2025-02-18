public abstract class Jogo {
    private String nome;
    private String tipo;
    private double valor;

    public Jogo(String nome, String tipo, double valor){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    } 


    public String toString() {
        return "Jogo " + nome + " é um " + tipo + " e custa R$" + valor;
    }

    public abstract void cobrar();
}