package ps2.teoria09;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PadariaController {

    @Autowired
    private PadariaRepo padariaRepo;

    public PadariaController() {
    }

    @GetMapping("/api/padarias/check")
    public String verificar() {
        return "Bem-vindo ao PadariaController!";
    }

    @GetMapping("/api/padarias")
    public Iterable<Padaria> getPadarias() {
        return padariaRepo.findAll(); 
    }

    @GetMapping("/api/padarias/{id}")
    public Optional<Padaria> getPadaria(@PathVariable long id) {
        return padariaRepo.findById(id);
    }

    @PostMapping("/api/padarias")
    public Padaria createPadaria(@RequestBody Padaria novaPadaria) {
        return padariaRepo.save(novaPadaria);
    }

}