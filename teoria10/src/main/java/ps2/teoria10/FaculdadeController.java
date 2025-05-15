package ps2.teoria10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FaculdadeController {

    @Autowired
    private FaculdadeRepo faculdadeRepo;

    @GetMapping("/dev/faculdades")
    public Iterable<Faculdade> consultarFaculdades(){
        return faculdadeRepo.findAll();
    }
    @PostMapping("/dev/faculdades")
    public Faculdade criar(@RequestBody Faculdade f){
        return faculdadeRepo.save(f);
    }

}
