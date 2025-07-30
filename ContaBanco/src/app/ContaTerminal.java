package app;

import service.ContaService;

import java.util.Scanner;

import domain.Conta;
import dto.ContaDTO;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);
        ContaService contaService = new ContaService();
        ContaDTO contaDTO = contaService.gerarMensagemBoasVindas(conta);

        System.out.println("\n" + contaDTO.getMensagem());

        scanner.close();
    }
    
}
