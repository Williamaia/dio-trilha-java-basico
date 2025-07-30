package service;

import domain.Conta;
import dto.ContaDTO;

public class ContaService {
    public ContaDTO gerarMensagemBoasVindas(Conta conta) {
        return new ContaDTO(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            conta.getNomeCliente(),
            conta.getAgencia(),
            conta.getNumero(),
            conta.getSaldo()
       ));
    }
}
