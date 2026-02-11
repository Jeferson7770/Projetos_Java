package br.com.jm;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico inteiro: ");

        int numeroPrimitivo = scanner.nextInt();

        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        System.out.println("Valor no tipo primitivo: " + numeroPrimitivo);
        System.out.println("Valor convertido para Wrapper: " + numeroWrapper);

        scanner.close();
    }
}
