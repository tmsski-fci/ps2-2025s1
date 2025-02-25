import java.util.List;

public interface GerenciadorNomes {
    
    int MAX_CARACTERES_NOMES =50;
    
    List<String> obterNomes();
    
    void adicionarNome(String nome);
    
}