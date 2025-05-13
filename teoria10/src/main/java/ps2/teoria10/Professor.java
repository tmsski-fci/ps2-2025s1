package ps2.teoria10;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private int matricula;
    private String area;

    @ManyToOne(fetch=FetchType.EAGER)
    private Faculdade faculdade;
}
