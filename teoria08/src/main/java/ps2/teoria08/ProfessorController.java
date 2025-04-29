package ps2.teoria08;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProfessorController {
    private List<Professor> professores;
    public ProfessorController() {
        professores = new ArrayList<>();
        professores.add(new Professor(1, "Ana", 1234));
        professores.add(new Professor(2, "Bob", 4321));
        professores.add(new Professor(3, "Charles", 2222));
        professores.add(new Professor(4, "Daniela", 4444));
    }

    @GetMapping("/api/professores") 
    public List<Professor> getProfessores() {
        return professores;
    } 
}