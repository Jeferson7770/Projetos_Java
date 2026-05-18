import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula (Ex: Miguel, Maria, João...):");
        String input = s.nextLine();

        String[] nomesArray = input.split(",");

        List<String> listaNomes = new ArrayList<>();

        for (String nome : nomesArray) {
            listaNomes.add(nome.trim());
        }

        // Ordenando a lista em ordem alfabética
        Collections.sort(listaNomes);

        // Imprimindo o resultado final
        System.out.println("\n--- Nomes Ordenados ---");
        System.out.println(listaNomes);

        s.close();
    }
}
