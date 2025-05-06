package ps2.teoria09;

public class Padaria {
    private long id;
    private String nome;
    private String endereco;
    public Padaria() {}
    public Padaria(long id, String n, String e) {
        this.id = id;
        nome = n;
        endereco = e;
    } 
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String e) { endereco = e; }

}
