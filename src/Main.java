import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número da conta");
        int numeroConta = entrada.nextInt();
        System.out.println("Informe a agência:");
        String agencia = entrada.next();
        System.out.println("Informe o nome do cliente:");
        String nomeCliente = entrada.next();
        System.out.println("saldo:");
        float saldo = entrada.nextFloat();


        ContaBancaria conta = new ContaBancaria(agencia, numeroConta, nomeCliente, saldo);
        System.out.println(conta.returnInfo());
        }
    }
