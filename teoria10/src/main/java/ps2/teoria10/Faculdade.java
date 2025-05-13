package ps2.teoria10;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Faculdade {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private int anoFundacao;
    private String cidade;
    private String estado;
}
