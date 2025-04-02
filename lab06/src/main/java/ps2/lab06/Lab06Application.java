package ps2.lab06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import static java.lang.System.out; 
import java.util.Scanner; 

@SpringBootApplication
public class Lab06Application implements CommandLineRunner {

	@Autowired
	private FaculdadeRepo faculdadeRepo;	

	@Autowired
	private ProfessorRepo professorRepo;

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(Lab06Application.class, args);
	}

	@Override
	public void run(String... args) {
		out.println("Gerenciador de Professores e Faculdades"); 
		boolean sair = false;
		while (!sair) {
			out.println("\nMenu");
			out.println("(1) Criar Faculdade");
			out.println("(2) Listar Faculdades");
			out.println("(3) Criar Professor");
			out.println("(4) Listar Professores");
			out.println("(0) Sair");
			out.print("# Escolha uma opção: ");
			int opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao) {
				case 1: criarFaculdade(); break; 
				case 2: listarFaculdades(); break; 
				case 3: criarProfessor(); break;
				case 4: out.println("Em implementação..."); break;
				case 0: sair = true; break;
				default:
					out.println("Opção inválida!");
			}
		}
		out.println("# Fim do programa!");
	}

	private void criarFaculdade() {
		out.println("\n# CRIAÇÃO DE NOVA FACULDADE");
		out.print("Nome da nova faculdade: ");
		String nome = entrada.nextLine();
		out.print("Ano da fundação desta faculdade: ");
		int ano = Integer.parseInt(entrada.nextLine());
		Faculdade f = new Faculdade(nome, ano);
		faculdadeRepo.save(f); 
	}

	private void listarFaculdades() {
		out.println("\n# LISTA DE FACULDADES");
		Iterable<Faculdade> faculdades = faculdadeRepo.findAll();
		for (Faculdade f: faculdades) { 
			out.println("[" + f.getId() + "] " + f.getNome() + " (fundada em " + f.getAnoFundacao() + ")"); 
		}
	}

	private void criarProfessor() {
		out.println("\n# CRIAÇÃO DE NOVO PROFESSOR");
		out.print("Nome do novo professor: ");
		String nome = entrada.nextLine();
		out.print("CPF do professor: ");
		String cpf = entrada.nextLine();
		out.print("Número de matrícula: ");
		int matricula = Integer.parseInt(entrada.nextLine());
		Professor p = new Professor(nome, cpf, matricula);
		professorRepo.save(p);  
	}
}
