/**
 * Classe que representa uma Conta Bancária do mundo real.
 * Permite realizar operações básicas como depósito, saque e consulta de saldo.
 *
 * @author Jeferson
 */
public class ContaBancaria {

    /**
     * Nome do titular da conta
     */
    private String titular;

    /**
     * Número da conta bancária
     */
    private String numero;

    /**
     * Saldo atual da conta
     */
    private double saldo;

    /**
     * Construtor da classe ContaBancaria.
     *
     * @param titular Nome do dono da conta
     * @param numero  Número da conta
     * @param saldo   Saldo inicial da conta
     */
    public ContaBancaria(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Realiza um depósito na conta.
     *
     * @param valor Valor que será adicionado ao saldo
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * Realiza um saque da conta, se houver saldo suficiente.
     *
     * @param valor Valor que será sacado
     */
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return Saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Retorna o nome do titular da conta.
     *
     * @return Nome do titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Retorna o número da conta.
     *
     * @return Número da conta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método principal para testar a classe.
     *
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Jeferson", "12345-6", 100);

        conta.depositar(50);
        conta.sacar(30);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Conta: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
