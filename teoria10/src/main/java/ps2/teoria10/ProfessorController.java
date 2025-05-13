package ps2.teoria10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorRepo professorRepo;
    
    @GetMapping("/dev/professores") 
    public Iterable<Professor> consultarProfessores(){
        return professorRepo.findAll();
    }
    
    @PostMapping("/dev/professores")
    public Professor criar(@RequestBody Professor p) { 
        return professorRepo.save(p);        
    }
}
