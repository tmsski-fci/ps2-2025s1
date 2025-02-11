import java.nio.file.*;
import java.util.Arrays;
import java.io.IOException;
public class App3 {
    public static void main(String[] args) {
        Path arq = Paths.get("correntistas.txt");
        try {
            String[] nomes = Files.readAllLines(arq).toArray(new String[0]);
            System.out.println(Arrays.toString(nomes));
        } catch(IOException ex) {
            System.out.println("Erro ao ler arquivo de correntistas!");
        }
    }
}