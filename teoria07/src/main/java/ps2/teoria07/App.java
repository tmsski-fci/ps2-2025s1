package ps2.teoria07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import static java.lang.System.out;
import java.util.Scanner;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private ProfessorRepo professorRepo;

	@Autowired
	private FaculdadeRepo faculdadeRepo;

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) {
		out.println("# Gerenciador de Professores e Faculdades!");
		//Professor p = new Professor("Carlos", "5555", 999);
		//professorRepo.save(p);
		//out.println("id do novo professor: " + p.getId());
		Faculdade f = new Faculdade("Faculdade de Engenharia", 1890);
		faculdadeRepo.save(f);
		out.println("id da nova faculdade: " + f.getId());

		out.println("Pressione ENTER para terminar o programa...");
		entrada.nextLine();
	}
}
