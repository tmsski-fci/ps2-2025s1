package ps2.lab05;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Game {
    @Id
    private long id;
    private String nome;
    private int ano;
    private String plataforma;
    public Game() {}
    public Game(long id, String n, int a, String p) {
        this.id = id;
        nome = n;
        ano = a;
        plataforma = p;
    }
    public void setId(long id) { this.id = id; }
    public long getId() { return id; }
    public void setNome(String n) { nome = n; }
    public String getNome() { return nome; }
    public void setAno(int a) { ano = a; }
    public int getAno() { return ano; }
    public void setPlataforma(String p) { plataforma = p; }
    public String getPlataforma() { return plataforma; }
}
