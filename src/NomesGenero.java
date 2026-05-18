import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomesGenero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite nome e sexo separados por hífen e vírgula (Ex: João-M, Maria-F, Miguel-M...):");
        String input = s.nextLine();

        String[] pessoas = input.split(",");

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String pessoa : pessoas) {
            String[] dados = pessoa.trim().split("-");

            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();

                // Adiciona na lista correta baseada no sexo
                if (sexo.equals("M")) {
                    masculinos.add(nome);
                } else if (sexo.equals("F")) {
                    femininos.add(nome);
                }
            }
        }

        // Imprimindo os grupos separados
        System.out.println("\n--- Grupo Masculino ---");
        System.out.println(masculinos);

        System.out.println("\n--- Grupo Feminino ---");
        System.out.println(femininos);

        s.close();
    }
}
