package ps2.lab06;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Faculdade {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private int anoFundacao;
    public Faculdade() {}
    public Faculdade(String n, int a) {
        nome = n;
        anoFundacao = a;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setNome(String n) {
        nome = n;
    }
    public String getNome() {
        return nome;
    }
    public void setAnoFundacao(int a) {
        anoFundacao = a;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
}
