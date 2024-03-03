package Programa;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public Conta obterConta(String agencia, String numeroConta, String Senha) {
        boolean agenciaValida = false;
        boolean contaValida = false;
        //boolean senhaValida = false;

        for (Conta conta : contas) {
            if (conta.getAgencia().equals(agencia)) {
                agenciaValida = true;
                if (conta.getNumeroConta().equals(numeroConta)) {
                    contaValida = true;
                    if (conta.getSenha().equals(Senha)) {
                        return conta;  // Acesso autorizado
                    } else {
                        System.out.println("Senha incorreta. Verifique seus dados.");
                        return null;  // Senha incorreta
                    }
                }
                break;  // Se a agência é válida, mas o número da conta está incorreto, não precisa continuar a busca.
            }
        }

        if (!agenciaValida) {
            System.out.println("Agência inválida. Verifique seus dados.");
        } else if (!contaValida) {
            System.out.println("Número da conta incorreto. Verifique seus dados.");
        }
        else {
            System.out.println("Todos os campos estão incorretos. Verifique seus dados.");
        }

        return null;  // Acesso negado
    }
}