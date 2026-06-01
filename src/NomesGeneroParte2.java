import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Pessoa {
    String nome;
    String sexo;
    int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}

public class NomesGeneroParte2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Set<Pessoa> masculinos = new TreeSet<>(
                Comparator.comparingInt((Pessoa p) -> p.idade)
                        .thenComparing(p -> p.nome));

        Set<Pessoa> femininos = new TreeSet<>(
                Comparator.comparingInt((Pessoa p) -> p.idade)
                        .thenComparing(p -> p.nome));

        String continuar;

        do {
            System.out.print("Nome: ");
            String nome = s.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = s.nextLine().trim().toUpperCase();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(s.nextLine());

            Pessoa pessoa = new Pessoa(nome, sexo, idade);

            if (sexo.equals("M")) {
                masculinos.add(pessoa);
            } else if (sexo.equals("F")) {
                femininos.add(pessoa);
            } else {
                System.out.println("Sexo inválido!");
            }

            System.out.print("Deseja cadastrar outra pessoa? (S/N): ");
            continuar = s.nextLine().trim().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("\n=== GRUPO MASCULINO ===");
        masculinos.forEach(System.out::println);

        System.out.println("\n=== GRUPO FEMININO ===");
        femininos.forEach(System.out::println);

        s.close();
    }
}