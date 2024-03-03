package Programa;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(Pessoa titular, String senha, double saldo, double taxaRendimento) {
        super(titular, senha, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    // Getters e setters específicos para ContaPoupanca
    // ...

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado com sucesso.");
    }
}
