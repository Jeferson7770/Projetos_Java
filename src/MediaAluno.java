import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String resposta = "";
        do {
            System.out.println("Digite a sua primeira nota: ");
            int n1 = s.nextInt();

            System.out.println("Digite a sua segunda nota: ");
            int n2 = s.nextInt();

            System.out.println("Digite a sua terceira nota: ");
            int n3 = s.nextInt();

            System.out.println("Digite a sua quarta nota: ");
            int n4 = s.nextInt();

            int media = (n1 + n2 + n3 + n4) / 4;

            if (media >= 7) {
                System.out.println("Você está Aprovado! Sua média: " + media);
            } else if (media >= 5) {
                System.out.println("Você está de Recuperação! Sua média: " + media);
            } else {
                System.out.println("Você está Reprovado! Sua média: " + media);
            }
            System.out.println("Deseja calcular novamente a sua Média? (Sim/Não): ");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("Obrigado e bons estudos!");
    }
}
