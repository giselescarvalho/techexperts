package Programa;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(Pessoa titular, String senha, double saldo, double limiteChequeEspecial) {
        super(titular, senha, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Getters e setters específicos para ContaCorrente
    // ...

    @Override
    public void sacar(double valor) {
        double saldoTotal = getSaldo() + limiteChequeEspecial;
        if (valor <= saldoTotal) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
        }
    }
}

