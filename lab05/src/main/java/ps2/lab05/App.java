package ps2.lab05;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import static java.lang.System.out;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private GameRepo gameRepo;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args); 
    }

    public void run(String... args) {
        out.println("Boa noite!");
        gameRepo.save(new Game(1, "Last of Us", 2015, "PlayStation"));
        gameRepo.save(new Game(2, "Fifa", 2022, "PlayStation")); 
    }
}