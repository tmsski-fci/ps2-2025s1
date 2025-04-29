package ps2.teoria08;

public class Professor {
    private long id;
    private String nome;
    private int matricula;
    public Professor() {}
    public Professor(long id, String n, int m) {
        this.id = id;
        nome = n;
        matricula = m;
    }
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }
    public int getMatricula() { return matricula; }
    public void setMatricula(int m) { matricula = m; }
}