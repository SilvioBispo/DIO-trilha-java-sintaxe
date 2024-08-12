
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int NumeroConta;
        String Agencia;
        String NomeCliente;
        float Saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome:");
        NomeCliente = scanner.nextLine();

        System.out.println("digite a sua agencia:");
        Agencia = scanner.nextLine();

        System.out.println("digite o numero da conta:");
        NumeroConta = scanner.nextInt();

        System.out.println("insira o saldo inicial:");
        Saldo = scanner.nextFloat();

        System.out.println("Olá "+ NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+ NumeroConta +" e seu saldo "+ Saldo +" já está disponível para saque");
    }
}
