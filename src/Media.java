public class Media {

    public static double calcularMedia(int n1, int n2, int n3, int n4) {
        return (n1 + n2 + n3 + n4) / 4.0;
    }

    public static void main(String[] args) {
        System.out.println("**** Calculadora de Média ****");
        System.out.println("Média: " + calcularMedia(10, 7, 9, 10));

    }
}
