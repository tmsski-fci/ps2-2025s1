package ps2.teoria09;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PadariaController {

    private List<Padaria> padarias;

    public PadariaController() {
        padarias = new ArrayList<>();
        padarias.add(new Padaria(1, "Primavera", "Rua Primavera, 1"));
        padarias.add(new Padaria(2, "Comendador", "Av. Comendador, 2"));
        padarias.add(new Padaria(3, "Paris", "Alameda Paris, 3")); 
    }

    @GetMapping("/api/padarias/check")
    public String verificar() {
        return "Bem-vindo ao PadariaController!";
    }

    @GetMapping("/api/padarias")
    public List<Padaria> getPadarias() {
        return this.padarias; 
    }

    @GetMapping("/api/padarias/{id}")
    public Padaria getPadaria(@PathVariable long id) {
        Padaria p = null;
        for (Padaria padaria: padarias) {
            if (id == padaria.getId()) {
                p = padaria;
            }
        }
        return p;
    }

    @PostMapping("/api/padarias")
    public Padaria createPadaria(@RequestBody Padaria novaPadaria) {
        long novoId = padarias.getLast().getId() + 1;
        novaPadaria.setId(novoId);
        padarias.add(novaPadaria);
        return novaPadaria;
    }

}